package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOrderComment<M extends BaseOrderComment<M>> extends Model<M> implements IBean {

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

	public void setOrderId(java.lang.Integer orderId) {
		set("order_id", orderId);
	}
	
	public java.lang.Integer getOrderId() {
		return getInt("order_id");
	}

	public void setOrderDetailId(java.lang.Integer orderDetailId) {
		set("order_detail_id", orderDetailId);
	}
	
	public java.lang.Integer getOrderDetailId() {
		return getInt("order_detail_id");
	}

	public void setGoodsId(java.lang.Integer goodsId) {
		set("goods_id", goodsId);
	}
	
	public java.lang.Integer getGoodsId() {
		return getInt("goods_id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	/**
	 * 评分：1=差评，2=中评，3=好
	 */
	public void setScore(java.math.BigDecimal score) {
		set("score", score);
	}
	
	/**
	 * 评分：1=差评，2=中评，3=好
	 */
	public java.math.BigDecimal getScore() {
		return get("score");
	}

	/**
	 * 评价内容
	 */
	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	/**
	 * 评价内容
	 */
	public java.lang.String getContent() {
		return getStr("content");
	}

	/**
	 * 图片
	 */
	public void setPicList(java.lang.String picList) {
		set("pic_list", picList);
	}
	
	/**
	 * 图片
	 */
	public java.lang.String getPicList() {
		return getStr("pic_list");
	}

	/**
	 * 是否隐藏：0=不隐藏，1=隐藏
	 */
	public void setIsHide(java.lang.Integer isHide) {
		set("is_hide", isHide);
	}
	
	/**
	 * 是否隐藏：0=不隐藏，1=隐藏
	 */
	public java.lang.Integer getIsHide() {
		return getInt("is_hide");
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

	public void setReplyContent(java.lang.String replyContent) {
		set("reply_content", replyContent);
	}
	
	public java.lang.String getReplyContent() {
		return getStr("reply_content");
	}

	public void setIsVirtual(java.lang.Integer isVirtual) {
		set("is_virtual", isVirtual);
	}
	
	public java.lang.Integer getIsVirtual() {
		return getInt("is_virtual");
	}

	public void setVirtualUser(java.lang.String virtualUser) {
		set("virtual_user", virtualUser);
	}
	
	public java.lang.String getVirtualUser() {
		return getStr("virtual_user");
	}

	public void setVirtualAvatar(java.lang.String virtualAvatar) {
		set("virtual_avatar", virtualAvatar);
	}
	
	public java.lang.String getVirtualAvatar() {
		return getStr("virtual_avatar");
	}

}
