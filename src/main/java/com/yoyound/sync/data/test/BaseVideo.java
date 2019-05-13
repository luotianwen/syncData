package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseVideo<M extends BaseVideo<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 标题
	 */
	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	/**
	 * 标题
	 */
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setUrl(java.lang.String url) {
		set("url", url);
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	/**
	 * 排序  升序
	 */
	public void setSort(java.lang.String sort) {
		set("sort", sort);
	}
	
	/**
	 * 排序  升序
	 */
	public java.lang.String getSort() {
		return getStr("sort");
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
	 * 商城id
	 */
	public void setStoreId(java.lang.Integer storeId) {
		set("store_id", storeId);
	}
	
	/**
	 * 商城id
	 */
	public java.lang.Integer getStoreId() {
		return getInt("store_id");
	}

	public void setPicUrl(java.lang.String picUrl) {
		set("pic_url", picUrl);
	}
	
	public java.lang.String getPicUrl() {
		return getStr("pic_url");
	}

	/**
	 * 详情介绍
	 */
	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	/**
	 * 详情介绍
	 */
	public java.lang.String getContent() {
		return getStr("content");
	}

	/**
	 * 视频来源 0--源地址 1--腾讯视频
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	/**
	 * 视频来源 0--源地址 1--腾讯视频
	 */
	public java.lang.Integer getType() {
		return getInt("type");
	}

}