package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseStepUser<M extends BaseStepUser<M>> extends Model<M> implements IBean {

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
	 * 活力币 
	 */
	public void setStepCurrency(java.math.BigDecimal stepCurrency) {
		set("step_currency", stepCurrency);
	}
	
	/**
	 * 活力币 
	 */
	public java.math.BigDecimal getStepCurrency() {
		return get("step_currency");
	}

	/**
	 * 用户ID
	 */
	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	/**
	 * 用户ID
	 */
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	 * 概率加成
	 */
	public void setRatio(java.lang.Integer ratio) {
		set("ratio", ratio);
	}
	
	/**
	 * 概率加成
	 */
	public java.lang.Integer getRatio() {
		return getInt("ratio");
	}

	/**
	 * 创建时间
	 */
	public void setCreateTime(java.lang.Integer createTime) {
		set("create_time", createTime);
	}
	
	/**
	 * 创建时间
	 */
	public java.lang.Integer getCreateTime() {
		return getInt("create_time");
	}

	/**
	 * 邀请ID
	 */
	public void setParentId(java.lang.Integer parentId) {
		set("parent_id", parentId);
	}
	
	/**
	 * 邀请ID
	 */
	public java.lang.Integer getParentId() {
		return getInt("parent_id");
	}

	/**
	 * 邀请好友加成
	 */
	public void setInviteRatio(java.lang.Integer inviteRatio) {
		set("invite_ratio", inviteRatio);
	}
	
	/**
	 * 邀请好友加成
	 */
	public java.lang.Integer getInviteRatio() {
		return getInt("invite_ratio");
	}

	public void setIsDelete(java.lang.Integer isDelete) {
		set("is_delete", isDelete);
	}
	
	public java.lang.Integer getIsDelete() {
		return getInt("is_delete");
	}

	/**
	 * 0提醒 1开启
	 */
	public void setRemind(java.lang.Integer remind) {
		set("remind", remind);
	}
	
	/**
	 * 0提醒 1开启
	 */
	public java.lang.Integer getRemind() {
		return getInt("remind");
	}

}
