package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdmin<M extends BaseAdmin<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}
	
	public java.lang.String getPassword() {
		return getStr("password");
	}

	public void setAuthKey(java.lang.String authKey) {
		set("auth_key", authKey);
	}
	
	public java.lang.String getAuthKey() {
		return getStr("auth_key");
	}

	public void setAccessToken(java.lang.String accessToken) {
		set("access_token", accessToken);
	}
	
	public java.lang.String getAccessToken() {
		return getStr("access_token");
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

	public void setAppMaxCount(java.lang.Integer appMaxCount) {
		set("app_max_count", appMaxCount);
	}
	
	public java.lang.Integer getAppMaxCount() {
		return getInt("app_max_count");
	}

	public void setPermission(java.lang.String permission) {
		set("permission", permission);
	}
	
	public java.lang.String getPermission() {
		return getStr("permission");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	/**
	 * 账户有效期至，0表示永久
	 */
	public void setExpireTime(java.lang.Integer expireTime) {
		set("expire_time", expireTime);
	}
	
	/**
	 * 账户有效期至，0表示永久
	 */
	public java.lang.Integer getExpireTime() {
		return getInt("expire_time");
	}

	/**
	 * 手机号
	 */
	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}
	
	/**
	 * 手机号
	 */
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

}
