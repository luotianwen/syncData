package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWechatPlatform<M extends BaseWechatPlatform<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 微擎公众号id
	 */
	public void setAcid(java.lang.Integer acid) {
		set("acid", acid);
	}
	
	/**
	 * 微擎公众号id
	 */
	public java.lang.Integer getAcid() {
		return getInt("acid");
	}

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	 * 公众号名称
	 */
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	/**
	 * 公众号名称
	 */
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	 * 公众号appid
	 */
	public void setAppId(java.lang.String appId) {
		set("app_id", appId);
	}
	
	/**
	 * 公众号appid
	 */
	public java.lang.String getAppId() {
		return getStr("app_id");
	}

	/**
	 * 公众号appsecret
	 */
	public void setAppSecret(java.lang.String appSecret) {
		set("app_secret", appSecret);
	}
	
	/**
	 * 公众号appsecret
	 */
	public java.lang.String getAppSecret() {
		return getStr("app_secret");
	}

	/**
	 * 公共号说明、备注
	 */
	public void setDesc(java.lang.String desc) {
		set("desc", desc);
	}
	
	/**
	 * 公共号说明、备注
	 */
	public java.lang.String getDesc() {
		return getStr("desc");
	}

	/**
	 * 微信支付商户号
	 */
	public void setMchId(java.lang.String mchId) {
		set("mch_id", mchId);
	}
	
	/**
	 * 微信支付商户号
	 */
	public java.lang.String getMchId() {
		return getStr("mch_id");
	}

	/**
	 * 微信支付key
	 */
	public void setKey(java.lang.String key) {
		set("key", key);
	}
	
	/**
	 * 微信支付key
	 */
	public java.lang.String getKey() {
		return getStr("key");
	}

	/**
	 * 微信支付cert文件内容
	 */
	public void setCertPem(java.lang.String certPem) {
		set("cert_pem", certPem);
	}
	
	/**
	 * 微信支付cert文件内容
	 */
	public java.lang.String getCertPem() {
		return getStr("cert_pem");
	}

	/**
	 * 微信支付key文件内容
	 */
	public void setKeyPem(java.lang.String keyPem) {
		set("key_pem", keyPem);
	}
	
	/**
	 * 微信支付key文件内容
	 */
	public java.lang.String getKeyPem() {
		return getStr("key_pem");
	}

	public void setAddtime(java.lang.Integer addtime) {
		set("addtime", addtime);
	}
	
	public java.lang.Integer getAddtime() {
		return getInt("addtime");
	}

	public void setIsDelete(java.lang.Integer isDelete) {
		set("is_delete", isDelete);
	}
	
	public java.lang.Integer getIsDelete() {
		return getInt("is_delete");
	}

}
