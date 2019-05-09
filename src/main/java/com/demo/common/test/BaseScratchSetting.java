package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseScratchSetting<M extends BaseScratchSetting<M>> extends Model<M> implements IBean {

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
	 * 概率
	 */
	public void setProbability(java.lang.Integer probability) {
		set("probability", probability);
	}
	
	/**
	 * 概率
	 */
	public java.lang.Integer getProbability() {
		return getInt("probability");
	}

	/**
	 * 抽奖次数
	 */
	public void setOppty(java.lang.Integer oppty) {
		set("oppty", oppty);
	}
	
	/**
	 * 抽奖次数
	 */
	public java.lang.Integer getOppty() {
		return getInt("oppty");
	}

	/**
	 * 1.天 2 用户
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	/**
	 * 1.天 2 用户
	 */
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	 * 开始时间
	 */
	public void setStartTime(java.lang.Integer startTime) {
		set("start_time", startTime);
	}
	
	/**
	 * 开始时间
	 */
	public java.lang.Integer getStartTime() {
		return getInt("start_time");
	}

	/**
	 * 结束时间
	 */
	public void setEndTime(java.lang.Integer endTime) {
		set("end_time", endTime);
	}
	
	/**
	 * 结束时间
	 */
	public java.lang.Integer getEndTime() {
		return getInt("end_time");
	}

	/**
	 * 小程序标题
	 */
	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	/**
	 * 小程序标题
	 */
	public java.lang.String getTitle() {
		return getStr("title");
	}

	/**
	 * 规则说明
	 */
	public void setRule(java.lang.String rule) {
		set("rule", rule);
	}
	
	/**
	 * 规则说明
	 */
	public java.lang.String getRule() {
		return getStr("rule");
	}

	/**
	 * 消耗积分
	 */
	public void setDepleteRegister(java.lang.Integer depleteRegister) {
		set("deplete_register", depleteRegister);
	}
	
	/**
	 * 消耗积分
	 */
	public java.lang.Integer getDepleteRegister() {
		return getInt("deplete_register");
	}

}
