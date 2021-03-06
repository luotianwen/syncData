package com.yoyound.sync.data;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.yoyound.sync.data.test.*;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("hjmall_attr", "id", Attr.class);
		arp.addMapping("hjmall_attr_group", "id", AttrGroup.class);
		arp.addMapping("hjmall_goods", "id", Goods.class);
		arp.addMapping("hjmall_goods_cat", "id", GoodsCat.class);
		arp.addMapping("hjmall_goods_pic", "id", GoodsPic.class);



	}
}

