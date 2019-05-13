package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserAccountLog<M extends BaseUserAccountLog<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	 * 类型：1=收入，2=支出
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	/**
	 * 类型：1=收入，2=支出
	 */
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	 * 变动金额
	 */
	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}
	
	/**
	 * 变动金额
	 */
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	/**
	 * 变动说明
	 */
	public void setDesc(java.lang.String desc) {
		set("desc", desc);
	}
	
	/**
	 * 变动说明
	 */
	public java.lang.String getDesc() {
		return getStr("desc");
	}

	public void setAddtime(java.lang.Integer addtime) {
		set("addtime", addtime);
	}
	
	public java.lang.Integer getAddtime() {
		return getInt("addtime");
	}

	/**
	 * 订单类型 0--充值 1--商城订单 2--秒杀订单 3--拼团订单 4--商城订单退款 5--秒杀订单退款 6--拼团订单退款
	 */
	public void setOrderType(java.lang.Integer orderType) {
		set("order_type", orderType);
	}
	
	/**
	 * 订单类型 0--充值 1--商城订单 2--秒杀订单 3--拼团订单 4--商城订单退款 5--秒杀订单退款 6--拼团订单退款
	 */
	public java.lang.Integer getOrderType() {
		return getInt("order_type");
	}

	/**
	 * 订单ID
	 */
	public void setOrderId(java.lang.Integer orderId) {
		set("order_id", orderId);
	}
	
	/**
	 * 订单ID
	 */
	public java.lang.Integer getOrderId() {
		return getInt("order_id");
	}

}