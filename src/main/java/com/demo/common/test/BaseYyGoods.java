package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseYyGoods<M extends BaseYyGoods<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	/**
	 * 商品名称
	 */
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	/**
	 * 商品名称
	 */
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	 * 预约金额
	 */
	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}
	
	/**
	 * 预约金额
	 */
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	/**
	 * 原价
	 */
	public void setOriginalPrice(java.math.BigDecimal originalPrice) {
		set("original_price", originalPrice);
	}
	
	/**
	 * 原价
	 */
	public java.math.BigDecimal getOriginalPrice() {
		return get("original_price");
	}

	/**
	 * 商品详情，图文
	 */
	public void setDetail(java.lang.String detail) {
		set("detail", detail);
	}
	
	/**
	 * 商品详情，图文
	 */
	public java.lang.String getDetail() {
		return getStr("detail");
	}

	/**
	 * 商品分类
	 */
	public void setCatId(java.lang.Long catId) {
		set("cat_id", catId);
	}
	
	/**
	 * 商品分类
	 */
	public java.lang.Long getCatId() {
		return getLong("cat_id");
	}

	/**
	 * 上架状态【1=> 上架，2=> 下架】
	 */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	/**
	 * 上架状态【1=> 上架，2=> 下架】
	 */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	 * 服务选项
	 */
	public void setService(java.lang.String service) {
		set("service", service);
	}
	
	/**
	 * 服务选项
	 */
	public java.lang.String getService() {
		return getStr("service");
	}

	/**
	 * 商品排序 升序
	 */
	public void setSort(java.lang.Long sort) {
		set("sort", sort);
	}
	
	/**
	 * 商品排序 升序
	 */
	public java.lang.Long getSort() {
		return getLong("sort");
	}

	/**
	 * 虚拟销量
	 */
	public void setVirtualSales(java.lang.Long virtualSales) {
		set("virtual_sales", virtualSales);
	}
	
	/**
	 * 虚拟销量
	 */
	public java.lang.Long getVirtualSales() {
		return getLong("virtual_sales");
	}

	/**
	 * 商品缩略图
	 */
	public void setCoverPic(java.lang.String coverPic) {
		set("cover_pic", coverPic);
	}
	
	/**
	 * 商品缩略图
	 */
	public java.lang.String getCoverPic() {
		return getStr("cover_pic");
	}

	/**
	 * 添加时间
	 */
	public void setAddtime(java.lang.Long addtime) {
		set("addtime", addtime);
	}
	
	/**
	 * 添加时间
	 */
	public java.lang.Long getAddtime() {
		return getLong("addtime");
	}

	/**
	 * 是否删除
	 */
	public void setIsDelete(java.lang.Integer isDelete) {
		set("is_delete", isDelete);
	}
	
	/**
	 * 是否删除
	 */
	public java.lang.Integer getIsDelete() {
		return getInt("is_delete");
	}

	/**
	 * 实际销量
	 */
	public void setSales(java.lang.Long sales) {
		set("sales", sales);
	}
	
	/**
	 * 实际销量
	 */
	public java.lang.Long getSales() {
		return getLong("sales");
	}

	/**
	 * 门店id
	 */
	public void setShopId(java.lang.String shopId) {
		set("shop_id", shopId);
	}
	
	/**
	 * 门店id
	 */
	public java.lang.String getShopId() {
		return getStr("shop_id");
	}

	public void setStoreId(java.lang.Long storeId) {
		set("store_id", storeId);
	}
	
	public java.lang.Long getStoreId() {
		return getLong("store_id");
	}

	/**
	 * 限购次数
	 */
	public void setBuyLimit(java.lang.Long buyLimit) {
		set("buy_limit", buyLimit);
	}
	
	/**
	 * 限购次数
	 */
	public java.lang.Long getBuyLimit() {
		return getLong("buy_limit");
	}

	/**
	 * 库存
	 */
	public void setStock(java.lang.Long stock) {
		set("stock", stock);
	}
	
	/**
	 * 库存
	 */
	public java.lang.Long getStock() {
		return getLong("stock");
	}

	/**
	 * 规格
	 */
	public void setAttr(java.lang.String attr) {
		set("attr", attr);
	}
	
	/**
	 * 规格
	 */
	public java.lang.String getAttr() {
		return getStr("attr");
	}

	/**
	 * 是否启用规格
	 */
	public void setUseAttr(java.lang.Integer useAttr) {
		set("use_attr", useAttr);
	}
	
	/**
	 * 是否启用规格
	 */
	public java.lang.Integer getUseAttr() {
		return getInt("use_attr");
	}

	/**
	 * 是否享受会员折扣 0-不享受 1--享受
	 */
	public void setIsLevel(java.lang.Boolean isLevel) {
		set("is_level", isLevel);
	}
	
	/**
	 * 是否享受会员折扣 0-不享受 1--享受
	 */
	public java.lang.Boolean getIsLevel() {
		return get("is_level");
	}

	/**
	 * 视频url
	 */
	public void setVideoUrl(java.lang.String videoUrl) {
		set("video_url", videoUrl);
	}
	
	/**
	 * 视频url
	 */
	public java.lang.String getVideoUrl() {
		return getStr("video_url");
	}

}