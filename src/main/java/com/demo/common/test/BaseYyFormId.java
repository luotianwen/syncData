package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseYyFormId<M extends BaseYyFormId<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 店铺id
	 */
	public void setStoreId(java.lang.Integer storeId) {
		set("store_id", storeId);
	}
	
	/**
	 * 店铺id
	 */
	public java.lang.Integer getStoreId() {
		return getInt("store_id");
	}

	/**
	 * 用户id
	 */
	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	/**
	 * 用户id
	 */
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	 * 微信openid
	 */
	public void setWechatOpenId(java.lang.String wechatOpenId) {
		set("wechat_open_id", wechatOpenId);
	}
	
	/**
	 * 微信openid
	 */
	public java.lang.String getWechatOpenId() {
		return getStr("wechat_open_id");
	}

	public void setFormId(java.lang.String formId) {
		set("form_id", formId);
	}
	
	public java.lang.String getFormId() {
		return getStr("form_id");
	}

	public void setOrderNo(java.lang.String orderNo) {
		set("order_no", orderNo);
	}
	
	public java.lang.String getOrderNo() {
		return getStr("order_no");
	}

	/**
	 * 可选值：form_id或prepay_id
	 */
	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	/**
	 * 可选值：form_id或prepay_id
	 */
	public java.lang.String getType() {
		return getStr("type");
	}

	/**
	 * 使用次数
	 */
	public void setSendCount(java.lang.Integer sendCount) {
		set("send_count", sendCount);
	}
	
	/**
	 * 使用次数
	 */
	public java.lang.Integer getSendCount() {
		return getInt("send_count");
	}

	public void setAddtime(java.lang.Integer addtime) {
		set("addtime", addtime);
	}
	
	public java.lang.Integer getAddtime() {
		return getInt("addtime");
	}

}
