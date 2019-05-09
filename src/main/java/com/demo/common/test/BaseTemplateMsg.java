package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTemplateMsg<M extends BaseTemplateMsg<M>> extends Model<M> implements IBean {

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
	 * 模版名称
	 */
	public void setTplName(java.lang.String tplName) {
		set("tpl_name", tplName);
	}
	
	/**
	 * 模版名称
	 */
	public java.lang.String getTplName() {
		return getStr("tpl_name");
	}

	/**
	 * 模版ID
	 */
	public void setTplId(java.lang.String tplId) {
		set("tpl_id", tplId);
	}
	
	/**
	 * 模版ID
	 */
	public java.lang.String getTplId() {
		return getStr("tpl_id");
	}

}
