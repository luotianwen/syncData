package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSender<M extends BaseSender<M>> extends Model<M> implements IBean {

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

	public void setCompany(java.lang.String company) {
		set("company", company);
	}
	
	public java.lang.String getCompany() {
		return getStr("company");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setTel(java.lang.String tel) {
		set("tel", tel);
	}
	
	public java.lang.String getTel() {
		return getStr("tel");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}
	
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	public void setPostCode(java.lang.String postCode) {
		set("post_code", postCode);
	}
	
	public java.lang.String getPostCode() {
		return getStr("post_code");
	}

	public void setProvince(java.lang.String province) {
		set("province", province);
	}
	
	public java.lang.String getProvince() {
		return getStr("province");
	}

	public void setCity(java.lang.String city) {
		set("city", city);
	}
	
	public java.lang.String getCity() {
		return getStr("city");
	}

	public void setExpArea(java.lang.String expArea) {
		set("exp_area", expArea);
	}
	
	public java.lang.String getExpArea() {
		return getStr("exp_area");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
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

	public void setDeliveryId(java.lang.Integer deliveryId) {
		set("delivery_id", deliveryId);
	}
	
	public java.lang.Integer getDeliveryId() {
		return getInt("delivery_id");
	}

}