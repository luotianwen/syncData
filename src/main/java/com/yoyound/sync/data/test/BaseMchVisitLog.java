package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMchVisitLog<M extends BaseMchVisitLog<M>> extends Model<M> implements IBean {

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}
	
	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	public void setMchId(java.lang.Integer mchId) {
		set("mch_id", mchId);
	}
	
	public java.lang.Integer getMchId() {
		return getInt("mch_id");
	}

	public void setAddtime(java.lang.Integer addtime) {
		set("addtime", addtime);
	}
	
	public java.lang.Integer getAddtime() {
		return getInt("addtime");
	}

	public void setVisitDate(java.util.Date visitDate) {
		set("visit_date", visitDate);
	}
	
	public java.util.Date getVisitDate() {
		return get("visit_date");
	}

}