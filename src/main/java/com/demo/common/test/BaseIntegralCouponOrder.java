package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseIntegralCouponOrder<M extends BaseIntegralCouponOrder<M>> extends Model<M> implements IBean {

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
	 * 用户id
	 */
	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	/**
	 * 用户id
	 */
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	 * 优惠券ID
	 */
	public void setCouponId(java.lang.Integer couponId) {
		set("coupon_id", couponId);
	}
	
	/**
	 * 优惠券ID
	 */
	public java.lang.Integer getCouponId() {
		return getInt("coupon_id");
	}

	/**
	 * 订单号
	 */
	public void setOrderNo(java.lang.String orderNo) {
		set("order_no", orderNo);
	}
	
	/**
	 * 订单号
	 */
	public java.lang.String getOrderNo() {
		return getStr("order_no");
	}

	/**
	 * 是否支付  0-未支付   1-支付 纯积分兑换
	 */
	public void setIsPay(java.lang.Integer isPay) {
		set("is_pay", isPay);
	}
	
	/**
	 * 是否支付  0-未支付   1-支付 纯积分兑换
	 */
	public java.lang.Integer getIsPay() {
		return getInt("is_pay");
	}

	/**
	 * 支付时间
	 */
	public void setPayTime(java.lang.Integer payTime) {
		set("pay_time", payTime);
	}
	
	/**
	 * 支付时间
	 */
	public java.lang.Integer getPayTime() {
		return getInt("pay_time");
	}

	/**
	 * 金额
	 */
	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}
	
	/**
	 * 金额
	 */
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	/**
	 * 积分数量
	 */
	public void setIntegral(java.lang.Integer integral) {
		set("integral", integral);
	}
	
	/**
	 * 积分数量
	 */
	public java.lang.Integer getIntegral() {
		return getInt("integral");
	}

	public void setAddtime(java.lang.Integer addtime) {
		set("addtime", addtime);
	}
	
	public java.lang.Integer getAddtime() {
		return getInt("addtime");
	}

}
