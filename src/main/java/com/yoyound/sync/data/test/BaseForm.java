package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseForm<M extends BaseForm<M>> extends Model<M> implements IBean {

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
	 * 名称
	 */
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	/**
	 * 名称
	 */
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	 * 类型
	 */
	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	/**
	 * 类型
	 */
	public java.lang.String getType() {
		return getStr("type");
	}

	/**
	 * 必填项
	 */
	public void setRequired(java.lang.Integer required) {
		set("required", required);
	}
	
	/**
	 * 必填项
	 */
	public java.lang.Integer getRequired() {
		return getInt("required");
	}

	/**
	 * 默认值
	 */
	public void setDefault(java.lang.String _default) {
		set("default", _default);
	}
	
	/**
	 * 默认值
	 */
	public java.lang.String getDefault() {
		return getStr("default");
	}

	/**
	 * 提示语
	 */
	public void setTip(java.lang.String tip) {
		set("tip", tip);
	}
	
	/**
	 * 提示语
	 */
	public java.lang.String getTip() {
		return getStr("tip");
	}

	/**
	 * 排序
	 */
	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}
	
	/**
	 * 排序
	 */
	public java.lang.Integer getSort() {
		return getInt("sort");
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
