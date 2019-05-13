package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSmsSetting<M extends BaseSmsSetting<M>> extends Model<M> implements IBean {

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
	 * 阿里云AccessKeyId
	 */
	public void setAccessKeyId(java.lang.String AccessKeyId) {
		set("AccessKeyId", AccessKeyId);
	}
	
	/**
	 * 阿里云AccessKeyId
	 */
	public java.lang.String getAccessKeyId() {
		return getStr("AccessKeyId");
	}

	/**
	 * 阿里云AccessKeySecret
	 */
	public void setAccessKeySecret(java.lang.String AccessKeySecret) {
		set("AccessKeySecret", AccessKeySecret);
	}
	
	/**
	 * 阿里云AccessKeySecret
	 */
	public java.lang.String getAccessKeySecret() {
		return getStr("AccessKeySecret");
	}

	/**
	 * 短信模板名称
	 */
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	/**
	 * 短信模板名称
	 */
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	 * 短信模板签名
	 */
	public void setSign(java.lang.String sign) {
		set("sign", sign);
	}
	
	/**
	 * 短信模板签名
	 */
	public java.lang.String getSign() {
		return getStr("sign");
	}

	/**
	 * 短信模板code
	 */
	public void setTpl(java.lang.String tpl) {
		set("tpl", tpl);
	}
	
	/**
	 * 短信模板code
	 */
	public java.lang.String getTpl() {
		return getStr("tpl");
	}

	/**
	 * 短信模板参数
	 */
	public void setMsg(java.lang.String msg) {
		set("msg", msg);
	}
	
	/**
	 * 短信模板参数
	 */
	public java.lang.String getMsg() {
		return getStr("msg");
	}

	/**
	 * 开启状态 0--关闭 1--开启
	 */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	/**
	 * 开启状态 0--关闭 1--开启
	 */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}
	
	public java.lang.String getMobile() {
		return getStr("mobile");
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
	 * 退款模板参数
	 */
	public void setTplRefund(java.lang.String tplRefund) {
		set("tpl_refund", tplRefund);
	}
	
	/**
	 * 退款模板参数
	 */
	public java.lang.String getTplRefund() {
		return getStr("tpl_refund");
	}

	/**
	 * 验证码模板参数
	 */
	public void setTplCode(java.lang.String tplCode) {
		set("tpl_code", tplCode);
	}
	
	/**
	 * 验证码模板参数
	 */
	public java.lang.String getTplCode() {
		return getStr("tpl_code");
	}

}