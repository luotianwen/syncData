package com.yoyound.sync.data;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.sun.deploy.util.StringUtils;
import com.yoyound.sync.data.test.Attr;
import com.yoyound.sync.data.test.Goods;
import com.yoyound.sync.data.test.GoodsCat;
import com.yoyound.sync.data.test.GoodsPic;
import com.jfinal.kit.JsonKit;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * 商城导入到php小程序
 */

public class Phpxcx {
    public void insertOldGoods2() {
        //6.2号
        List<Record> goods = Db.use("old").find("SELECT g.id as id, g.num as gid,  g.name,g.price,g.market_price,d.details ,g.logo ,g.artNo,b.num from s_goods g ,s_goods_detail d ,s_brand b where g.del_flag='0' and g.pass='1' and     g.brand_id=b.id and  d.goods_id=g.id and g.create_date>='2019-06-10 00:00:00'and g.create_date<='2019-06-17 00:00:00' and  g.brand_id not in (select id from s_syncstock  )");
        int num = 0;
        for (Record r : goods) {
            num = 0;
            List<Record> skus = Db.use("old").find("SELECT s.goods_id as id ,s.stock as num ,s.spec1,s.spec2,s.price as price   from s_goods_sku s where stock>0 and  s.goods_id=?", r.getStr("id"));
            Record og = Db.use("new").findFirst("select id from  hjmall_goods where name=?", r.getStr("name"));
            List<Record> alldata = new ArrayList<>();
            for (Record s : skus) {
                //同步规格

                num += s.getInt("num");
                Record data = new Record();
                List<Record> attr_list = new ArrayList<>();
                if (null != s.getStr("spec2")) {
                    Record attr1 = Db.use("new").findFirst("SELECT id as attr_id,attr_name   from hjmall_attr where attr_name=?", s.getStr("spec1"));
                    if (null == attr1) {
                        attr1 = new Record();
                        Attr a = new Attr();
                        a.setAttrName(s.getStr("spec1"));
                        a.setAttrGroupId(4);
                        a.setIsDelete(0);
                        a.setIsDefault(0);
                        a.save();
                        attr1.set("attr_id", a.getId());
                        attr1.set("attr_name", a.getAttrName());
                    }
                    attr_list.add(attr1);
                    Record attr2 = Db.use("new").findFirst("SELECT id as attr_id,attr_name   from hjmall_attr where attr_name=?", s.getStr("spec2"));
                    if (null == attr2) {
                        attr2 = new Record();
                        Attr a = new Attr();
                        a.setAttrName(s.getStr("spec2"));
                        a.setAttrGroupId(2);
                        a.setIsDelete(0);
                        a.setIsDefault(0);
                        a.save();
                        attr2.set("attr_id", a.getId());
                        attr2.set("attr_name", a.getAttrName());
                    }
                    attr_list.add(attr2);
                } else {
                    Record attr1 = Db.use("new").findFirst("SELECT id as attr_id,attr_name   from hjmall_attr where attr_name=?", s.getStr("spec1"));
                    if (null == attr1) {
                        attr1 = new Record();
                        Attr a = new Attr();
                        a.setAttrName(s.getStr("spec1"));
                        a.setAttrGroupId(2);
                        a.setIsDelete(0);
                        a.setIsDefault(0);
                        a.save();
                        attr1.set("attr_id", a.getId());
                        attr1.set("attr_name", a.getAttrName());
                    }
                    attr_list.add(attr1);
                }


                data.set("attr_list", attr_list);
                data.set("num", s.get("num"));
                data.set("price", s.get("price"));
                data.set("no", r.getStr("artNo"));
                data.set("pic", "");
                data.set("share_commission_first", "");
                data.set("share_commission_second", "");
                data.set("share_commission_third", "");
                data.set("member1", "");
                data.set("member2", "");
                data.set("member3", "");
                data.set("member4", "");
                alldata.add(data);
            }
            if (null == og) {
                //int id=r.getInt("gid")
                //同步商品
                String logo = r.getStr("logo");
                GoodsPic pic = new GoodsPic();
                pic.setGoodsId(r.getInt("gid"));

                if (logo.indexOf("http") < 0) {
                    pic.setPicUrl("http://image.yoyound.com/" + logo);

                } else {
                    pic.setPicUrl(r.getStr("logo"));
                }

                pic.setIsDelete(0);
                pic.save();
                ////品牌
                GoodsCat cat = new GoodsCat();
                cat.setGoodsId(r.getInt("gid"));
                cat.setStoreId(2);
                cat.setAddtime(new Long(System.currentTimeMillis() / 1000).intValue());
                cat.setIsDelete(0);
                cat.setCatId(r.getInt("num"));
                cat.save();

                //分类
                List<Record> cs = Db.use("old").find("SELECT c.num  from s_goods_category s , s_category c where  c.id=s.category_id and  s.goods_id=?", r.getStr("id"));
                for (Record rs : cs
                ) {
                    GoodsCat c = new GoodsCat();
                    c.setGoodsId(r.getInt("gid"));
                    c.setStoreId(2);
                    c.setAddtime((int) (System.currentTimeMillis() / 1000));
                    c.setIsDelete(0);
                    c.setCatId(rs.getInt("num"));
                    c.save();
                }
                //Db.use("new").delete("delete from hjmall_goods  where id=?",good.getInt("gid"));
                // Record og=Db.use("new").findFirst("select id from  hjmall_goods where id=?",good.getInt("gid"));
                /* if(null==og) {*/
                Goods g = new Goods();
                g.setAddtime((int) (System.currentTimeMillis() / 1000));
                g.setStoreId(2);
                g.setId(r.getInt("gid"));
                //good
                g.setName(r.getStr("name"));
                g.setPrice(r.getFloat("price"));
                g.setOriginalPrice(r.getFloat("market_price"));
                g.setDetail(r.getStr("details"));
                g.setCatId(0l);

                g.setStatus(1);
                g.setIsDelete(0);
                g.setAttr(JsonKit.toJson(alldata));
                g.setService("正品保障,极速发货,7天退换货");
                g.setSort(1000);
                g.setVirtualSales(new Random().nextInt(500) + 1);

                if (logo == null) {
                    return;
                }
                if (logo.indexOf("http") < 0) {
                    g.setCoverPic("http://image.yoyound.com/" + logo);
                } else {
                    g.setCoverPic(r.getStr("logo"));

                }
                g.setUnit("件");
                g.setIndividualShare(0);
                g.setFullCut("{\"pieces\":\"\",\"forehead\":\"\"}");
                g.setIntegral("{\"give\":\"0\",\"forehead\":\"\",\"more\":\"\"}");
                g.setGoodsNum(num);
                try {
                    g.save();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                if (num > 0) {

                    //同步库存
                    Db.use("new").update("update hjmall_goods set attr=?,status=1 where id=? ", JsonKit.toJson(alldata), og.getInt("id"));
                }
            }
            System.out.println("comp" + r.getInt("gid"));
        }
    }

    public void insertOldGoods() {
        System.out.println("读取老数据信息");
        List<Record> goods = Db.use("old").find("SELECT  id    from dd");
        int num = 0;
        for (Record r : goods) {
            num = 0;
            Record good = Db.use("old").findFirst("SELECT g.id as id, g.num as gid,  g.name,g.price,g.market_price,d.details ,g.logo ,g.artNo,b.num from s_goods g ,s_goods_detail d ,s_brand b where g.brand_id=b.id and  d.goods_id=g.id and g.num=?", r.getStr("id"));
            if (good == null) {
                continue;
            }
            List<Record> skus = Db.use("old").find("SELECT s.goods_id as id ,s.stock as num ,s.spec1,s.spec2,s.price as price   from s_goods_sku s where stock>0 and  s.goods_id=?", good.getStr("id"));

            List<Record> alldata = new ArrayList<>();
            for (Record s : skus) {
                num += s.getInt("num");
                Record data = new Record();
                List<Record> attr_list = new ArrayList<>();
                if (StrKit.isBlank(s.getStr("spec2"))) {
                    Record attr1 = Db.use("new").findFirst("SELECT id as attr_id,attr_name   from hjmall_attr where attr_name=?", s.getStr("spec1"));
                    if (null == attr1) {
                        attr1 = new Record();
                        Attr a = new Attr();
                        a.setAttrName(s.getStr("spec1"));
                        a.setAttrGroupId(2);
                        a.setIsDelete(0);
                        a.setIsDefault(0);
                        a.save();
                        attr1.set("attr_id", a.getId());
                        attr1.set("attr_name", a.getAttrName());
                    }
                    attr_list.add(attr1);
                } else {
                    Record attr1 = Db.use("new").findFirst("SELECT id as attr_id,attr_name   from hjmall_attr where attr_name=?", s.getStr("spec1"));
                    if (null == attr1) {
                        attr1 = new Record();
                        Attr a = new Attr();
                        a.setAttrName(s.getStr("spec1"));
                        a.setAttrGroupId(4);
                        a.setIsDelete(0);
                        a.setIsDefault(0);
                        a.save();
                        attr1.set("attr_id", a.getId());
                        attr1.set("attr_name", a.getAttrName());
                    }


                    Record attr2 = Db.use("new").findFirst("SELECT id as attr_id,attr_name   from hjmall_attr where attr_name=?", s.getStr("spec2"));
                    if (null == attr2) {
                        attr2 = new Record();
                        Attr a = new Attr();
                        a.setAttrName(s.getStr("spec2"));
                        a.setAttrGroupId(2);
                        a.setIsDelete(0);
                        a.setIsDefault(0);
                        a.save();
                        attr2.set("attr_id", a.getId());
                        attr2.set("attr_name", a.getAttrName());
                    }
                    attr_list.add(attr1);
                    attr_list.add(attr2);
                }


                data.set("attr_list", attr_list);
                data.set("num", s.get("num"));
                data.set("price", s.get("price"));
                data.set("no", good.getStr("artNo"));
                data.set("pic", "");
                data.set("share_commission_first", "");
                data.set("share_commission_second", "");
                data.set("share_commission_third", "");
                data.set("member1", "");
                data.set("member2", "");
                data.set("member3", "");
                data.set("member4", "");
                alldata.add(data);
            }
            Goods g = new Goods();
            g.setAddtime(new Long(System.currentTimeMillis()).intValue());
            g.setStoreId(2);
            g.setId(good.getInt("gid"));
            //good
            g.setName(good.getStr("name"));
            g.setPrice(good.getFloat("price"));
            g.setOriginalPrice(good.getFloat("market_price"));
            g.setDetail(good.getStr("details"));
            g.setCatId(0l);

            g.setStatus(1);
            g.setIsDelete(0);
            g.setAttr(JsonKit.toJson(alldata));
            g.setService("正品保障,极速发货,7天退换货");
            g.setSort(1000);
            g.setVirtualSales(new Random().nextInt(500) + 1);
            String logo = good.getStr("logo");
            if (logo == null) {
                continue;
            }
            if (logo.indexOf("http") < 0) {
                g.setCoverPic("http://image.yoyound.com/" + logo);
            } else {
                g.setCoverPic(good.getStr("logo"));

            }
            g.setUnit("件");
            g.setIndividualShare(0);
            g.setFullCut("{\"pieces\":\"\",\"forehead\":\"\"}");
            g.setIntegral("{\"give\":\"0\",\"forehead\":\"\",\"more\":\"\"}");
            g.setGoodsNum(num);
            g.save();
            GoodsPic pic = new GoodsPic();
            pic.setGoodsId(good.getInt("gid"));

            if (logo.indexOf("http") < 0) {
                pic.setPicUrl("http://image.yoyound.com/" + logo);

            } else {
                pic.setPicUrl(good.getStr("logo"));
            }

            pic.setIsDelete(0);
            pic.save();
            ////品牌
            GoodsCat cat = new GoodsCat();
            cat.setGoodsId(good.getInt("gid"));
            cat.setStoreId(2);
            cat.setAddtime(new Long(System.currentTimeMillis() / 1000).intValue());
            cat.setIsDelete(0);
            cat.setCatId(good.getInt("num"));
            cat.save();

            //分类
            List<Record> cs = Db.use("old").find("SELECT c.num  from s_goods_category s , s_category c where  c.id=s.category_id and  s.goods_id=?", good.getStr("id"));
            for (Record rs : cs
            ) {
                GoodsCat c = new GoodsCat();
                c.setGoodsId(good.getInt("gid"));
                c.setStoreId(2);
                c.setAddtime(new Long(System.currentTimeMillis() / 1000).intValue());
                c.setIsDelete(0);
                c.setCatId(rs.getInt("num"));
                c.save();
            }


            System.out.println("goods" + good.getInt("gid"));

            //Db.use("new").update("update hjmall_goods set attr=? where id=? ",JsonKit.toJson(alldata),r.getStr("id"));
        }

    }

    public void getOldGoods() {
        System.out.println("读取老数据信息");
        List<Record> goods = Db.use("old").find("SELECT  id as id  from dd");
        for (Record r : goods) {
            List<Record> skus = Db.use("old").find("SELECT s.goods_id as id ,s.stock as num ,s.spec1,s.spec2,s.price as price   from s_goods_sku s where s.goods_id=?", r.getStr("id"));
            List<Record> alldata = new ArrayList<>();
            for (Record s : skus) {
                Record data = new Record();
                List<Record> attr_list = new ArrayList<>();
                if (StrKit.isBlank(s.getStr("spec1")) || StrKit.isBlank(s.getStr("spec2"))) {
                    break;
                }
                Record attr1 = Db.use("new").findFirst("SELECT id as attr_id,attr_name   from hjmall_attr where attr_name=?", s.getStr("spec1"));
                if (null == attr1) {
                    attr1 = new Record();
                    Attr a = new Attr();
                    a.setAttrName(s.getStr("spec1"));
                    a.setAttrGroupId(4);
                    a.setIsDelete(0);
                    a.setIsDefault(0);
                    a.save();
                    attr1.set("attr_id", a.getId());
                    attr1.set("attr_name", a.getAttrName());
                }


                Record attr2 = Db.use("new").findFirst("SELECT id as attr_id,attr_name   from hjmall_attr where attr_name=?", s.getStr("spec2"));
                if (null == attr2) {
                    attr2 = new Record();
                    Attr a = new Attr();
                    a.setAttrName(s.getStr("spec2"));
                    a.setAttrGroupId(2);
                    a.setIsDelete(0);
                    a.setIsDefault(0);
                    a.save();
                    attr2.set("attr_id", a.getId());
                    attr2.set("attr_name", a.getAttrName());
                }


                attr_list.add(attr1);
                attr_list.add(attr2);
                data.set("attr_list", attr_list);
                data.set("num", s.get("num"));
                data.set("price", s.get("price"));
                data.set("no", "");
                data.set("pic", "");
                data.set("share_commission_first", "");
                data.set("share_commission_second", "");
                data.set("share_commission_third", "");
                data.set("member1", "");
                data.set("member2", "");
                data.set("member3", "");
                data.set("member4", "");
                alldata.add(data);
            }

            System.out.println(JsonKit.toJson(alldata));

            //Db.use("new").update("update hjmall_goods set attr=? where id=? ",JsonKit.toJson(alldata),r.getStr("id"));
        }

    }

    public static InputStream getResourcesFileInputStream(String fileName) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("" + fileName);
    }

    public void readExcel() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("F:\\商品\\淘宝助理4201906181313\\淘宝助理4201906181313.xls"));
            List<Object> data = EasyExcelFactory.read(new BufferedInputStream(inputStream), new Sheet(1, 3, GoodsInfo.class));
            String brandid="134";//品牌id
            String cid="02160a458e9c46d89151e353d8a4a3ce";//分类id
            String path="/userfiles/1/images/goods/main/2019/06/0619/";
            String spec1="规格";
            String spec2="";
            for (Object o : data
            ) {
                try {
                    GoodsInfo g = (GoodsInfo) o;
                    String id = UUID.randomUUID().toString().replaceAll("-", "");
                    String[] imgs = g.getImgs().split(";");
                    String[] imgss = new String[imgs.length];
                    StringBuffer var2 = new StringBuffer();
                    int i = 0;
                    for (String str : imgs
                    ) {
                        imgss[i] = path + str.split(":")[0] + ".tbi";
                        var2.append(imgss[i]).append("|");
                        i++;

                    }

                    Db.use("old").update("INSERT INTO  s_goods(`id`,`name`, `artNo`, `logo`, `market_price`, `brand_id`,  `spec1`, `spec2`,   `imgs`,supplier_id) VALUES (?,?,?,?,?,?,?,?,?,?)",
                            id, g.getName(), g.getArtNo(), imgss[0], g.getMarketPrice(), brandid, spec1, spec2, var2.toString(),"");
                    Db.use("old").update("INSERT INTO  s_goods_detail(`goods_id`,`details`) VALUES (?,?)", id, g.getDetails());
                    Db.use("old").update("INSERT INTO  s_goods_category(`goods_id`,`category_id`) VALUES (?,?)", id, cid);

                    String[] skus = g.getSkus().split(";");
                    for (String str : skus
                    ) {
                        Db.use("old").update("INSERT INTO  s_goods_sku(`id`, `goods_id`, `spec1`, `spec2`, `stock`, `market_price`)  VALUES (?,?,?,?,?,?)",
                                UUID.randomUUID().toString().replaceAll("-", ""), id, str.split(":")[2], "", "2", g.getMarketPrice());
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        List<Record> alldata = new ArrayList<>();
        Record data = new Record();
        Record attr1 = new Record();
        attr1.set("attr_id", 22);
        attr1.set("attr_name", "丁香紫");
        Record attr2 = new Record();
        attr2.set("attr_id", 21);
        attr2.set("attr_name", "S");
        List<Record> attr_list = new ArrayList<>();
        attr_list.add(attr1);
        attr_list.add(attr2);
        data.set("attr_list", attr_list);
        data.set("num", 1);
        data.set("price", 2399);
        data.set("no", "");
        data.set("pic", "");
        data.set("share_commission_first", "");
        data.set("share_commission_second", "");
        data.set("share_commission_third", "");
        data.set("member1", "");
        data.set("member2", "");
        data.set("member3", "");
        data.set("member4", "");
        alldata.add(data);
        System.out.println(JsonKit.toJson(alldata));

    }

}
