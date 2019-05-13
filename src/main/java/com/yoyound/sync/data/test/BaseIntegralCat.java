package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseIntegralCat<M extends BaseIntegralCat<M>> extends Model<M> implements IBean {

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
	 * 商品名称
	 */
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	/**
	 * 商品名称
	 */
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	 * 分类图片url
	 */
	public void setPicUrl(java.lang.String picUrl) {
		set("pic_url", picUrl);
	}
	
	/**
	 * 分类图片url
	 */
	public java.lang.String getPicUrl() {
		return getStr("pic_url");
	}

	/**
	 * 排序，升序
	 */
	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}
	
	/**
	 * 排序，升序
	 */
	public java.lang.Integer getSort() {
		return getInt("sort");
	}

}