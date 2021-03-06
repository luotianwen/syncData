package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRecharge<M extends BaseRecharge<M>> extends Model<M> implements IBean {

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
	 * 支付金额
	 */
	public void setPayPrice(java.math.BigDecimal payPrice) {
		set("pay_price", payPrice);
	}
	
	/**
	 * 支付金额
	 */
	public java.math.BigDecimal getPayPrice() {
		return get("pay_price");
	}

	/**
	 * 赠送金额
	 */
	public void setSendPrice(java.math.BigDecimal sendPrice) {
		set("send_price", sendPrice);
	}
	
	/**
	 * 赠送金额
	 */
	public java.math.BigDecimal getSendPrice() {
		return get("send_price");
	}

	/**
	 * 充值名称
	 */
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	/**
	 * 充值名称
	 */
	public java.lang.String getName() {
		return getStr("name");
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

}
