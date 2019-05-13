package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDelivery<M extends BaseDelivery<M>> extends Model<M> implements IBean {

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
	 * 快递公司id
	 */
	public void setExpressId(java.lang.Integer expressId) {
		set("express_id", expressId);
	}
	
	/**
	 * 快递公司id
	 */
	public java.lang.Integer getExpressId() {
		return getInt("express_id");
	}

	/**
	 * 电子面单客户账号
	 */
	public void setCustomerName(java.lang.String customerName) {
		set("customer_name", customerName);
	}
	
	/**
	 * 电子面单客户账号
	 */
	public java.lang.String getCustomerName() {
		return getStr("customer_name");
	}

	/**
	 * 电子面单密码
	 */
	public void setCustomerPwd(java.lang.String customerPwd) {
		set("customer_pwd", customerPwd);
	}
	
	/**
	 * 电子面单密码
	 */
	public java.lang.String getCustomerPwd() {
		return getStr("customer_pwd");
	}

	/**
	 * 月结编码
	 */
	public void setMonthCode(java.lang.String monthCode) {
		set("month_code", monthCode);
	}
	
	/**
	 * 月结编码
	 */
	public java.lang.String getMonthCode() {
		return getStr("month_code");
	}

	/**
	 * 网点编码
	 */
	public void setSendSite(java.lang.String sendSite) {
		set("send_site", sendSite);
	}
	
	/**
	 * 网点编码
	 */
	public java.lang.String getSendSite() {
		return getStr("send_site");
	}

	/**
	 * 网点名称
	 */
	public void setSendName(java.lang.String sendName) {
		set("send_name", sendName);
	}
	
	/**
	 * 网点名称
	 */
	public java.lang.String getSendName() {
		return getStr("send_name");
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