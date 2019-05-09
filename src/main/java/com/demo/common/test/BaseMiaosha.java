package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMiaosha<M extends BaseMiaosha<M>> extends Model<M> implements IBean {

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
	 * 开放时间，JSON格式
	 */
	public void setOpenTime(java.lang.String openTime) {
		set("open_time", openTime);
	}
	
	/**
	 * 开放时间，JSON格式
	 */
	public java.lang.String getOpenTime() {
		return getStr("open_time");
	}

}
