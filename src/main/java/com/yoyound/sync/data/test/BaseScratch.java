package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseScratch<M extends BaseScratch<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setStoreId(java.lang.Integer storeId) {
		set("store_id", storeId);
	}
	
	public java.lang.Integer getStoreId() {
		return getInt("store_id");
	}

	/**
	 * 1.红包2.优惠卷3.积分4.实物
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	/**
	 * 1.红包2.优惠卷3.积分4.实物
	 */
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	 * 积分数量
	 */
	public void setNum(java.lang.Integer num) {
		set("num", num);
	}
	
	/**
	 * 积分数量
	 */
	public java.lang.Integer getNum() {
		return getInt("num");
	}

	/**
	 * 红包价格
	 */
	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}
	
	/**
	 * 红包价格
	 */
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	/**
	 * 库存
	 */
	public void setStock(java.lang.Integer stock) {
		set("stock", stock);
	}
	
	/**
	 * 库存
	 */
	public java.lang.Integer getStock() {
		return getInt("stock");
	}

	/**
	 * 优惠卷
	 */
	public void setCouponId(java.lang.Integer couponId) {
		set("coupon_id", couponId);
	}
	
	/**
	 * 优惠卷
	 */
	public java.lang.Integer getCouponId() {
		return getInt("coupon_id");
	}

	/**
	 * 赠品
	 */
	public void setGiftId(java.lang.Integer giftId) {
		set("gift_id", giftId);
	}
	
	/**
	 * 赠品
	 */
	public java.lang.Integer getGiftId() {
		return getInt("gift_id");
	}

	public void setCreateTime(java.lang.Integer createTime) {
		set("create_time", createTime);
	}
	
	public java.lang.Integer getCreateTime() {
		return getInt("create_time");
	}

	public void setUpdateTime(java.lang.Integer updateTime) {
		set("update_time", updateTime);
	}
	
	public java.lang.Integer getUpdateTime() {
		return getInt("update_time");
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
	 * 0关闭 1开启
	 */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	/**
	 * 0关闭 1开启
	 */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	 * 1删除
	 */
	public void setIsDelete(java.lang.Integer isDelete) {
		set("is_delete", isDelete);
	}
	
	/**
	 * 1删除
	 */
	public java.lang.Integer getIsDelete() {
		return getInt("is_delete");
	}

}
