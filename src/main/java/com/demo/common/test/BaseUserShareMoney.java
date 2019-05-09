package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserShareMoney<M extends BaseUserShareMoney<M>> extends Model<M> implements IBean {

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

	/**
	 * 用户ID
	 */
	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	/**
	 * 用户ID
	 */
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	 * 类型 0--佣金 1--提现
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	/**
	 * 类型 0--佣金 1--提现
	 */
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	 * 佣金来源 1--一级分销 2--二级分销 3--三级分销
	 */
	public void setSource(java.lang.Integer source) {
		set("source", source);
	}
	
	/**
	 * 佣金来源 1--一级分销 2--二级分销 3--三级分销
	 */
	public java.lang.Integer getSource() {
		return getInt("source");
	}

	/**
	 * 金额
	 */
	public void setMoney(java.math.BigDecimal money) {
		set("money", money);
	}
	
	/**
	 * 金额
	 */
	public java.math.BigDecimal getMoney() {
		return get("money");
	}

	public void setIsDelete(java.lang.Integer isDelete) {
		set("is_delete", isDelete);
	}
	
	public java.lang.Integer getIsDelete() {
		return getInt("is_delete");
	}

	public void setAddtime(java.lang.Integer addtime) {
		set("addtime", addtime);
	}
	
	public java.lang.Integer getAddtime() {
		return getInt("addtime");
	}

	/**
	 * 订单类型 0--商城订单 1--秒杀订单 2--拼团订单 3--预约订单
	 */
	public void setOrderType(java.lang.Integer orderType) {
		set("order_type", orderType);
	}
	
	/**
	 * 订单类型 0--商城订单 1--秒杀订单 2--拼团订单 3--预约订单
	 */
	public java.lang.Integer getOrderType() {
		return getInt("order_type");
	}

	/**
	 * 版本
	 */
	public void setVersion(java.lang.String version) {
		set("version", version);
	}
	
	/**
	 * 版本
	 */
	public java.lang.String getVersion() {
		return getStr("version");
	}

}