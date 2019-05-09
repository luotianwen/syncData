package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOrderRefund<M extends BaseOrderRefund<M>> extends Model<M> implements IBean {

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

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("user_id");
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

	/**
	 * 退款单号
	 */
	public void setOrderRefundNo(java.lang.String orderRefundNo) {
		set("order_refund_no", orderRefundNo);
	}
	
	/**
	 * 退款单号
	 */
	public java.lang.String getOrderRefundNo() {
		return getStr("order_refund_no");
	}

	/**
	 * 售后类型：1=退货退款，2=换货
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	/**
	 * 售后类型：1=退货退款，2=换货
	 */
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	 * 退款金额
	 */
	public void setRefundPrice(java.math.BigDecimal refundPrice) {
		set("refund_price", refundPrice);
	}
	
	/**
	 * 退款金额
	 */
	public java.math.BigDecimal getRefundPrice() {
		return get("refund_price");
	}

	/**
	 * 退款说明
	 */
	public void setDesc(java.lang.String desc) {
		set("desc", desc);
	}
	
	/**
	 * 退款说明
	 */
	public java.lang.String getDesc() {
		return getStr("desc");
	}

	/**
	 * 凭证图片列表：json格式
	 */
	public void setPicList(java.lang.String picList) {
		set("pic_list", picList);
	}
	
	/**
	 * 凭证图片列表：json格式
	 */
	public java.lang.String getPicList() {
		return getStr("pic_list");
	}

	/**
	 * 状态：0=待商家处理，1=同意并已退款，2=已同意换货，3=已拒绝退换货
	 */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	/**
	 * 状态：0=待商家处理，1=同意并已退款，2=已同意换货，3=已拒绝退换货
	 */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	 * 拒绝退换货原因
	 */
	public void setRefuseDesc(java.lang.String refuseDesc) {
		set("refuse_desc", refuseDesc);
	}
	
	/**
	 * 拒绝退换货原因
	 */
	public java.lang.String getRefuseDesc() {
		return getStr("refuse_desc");
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

	/**
	 * 商家处理时间
	 */
	public void setResponseTime(java.lang.Integer responseTime) {
		set("response_time", responseTime);
	}
	
	/**
	 * 商家处理时间
	 */
	public java.lang.Integer getResponseTime() {
		return getInt("response_time");
	}

	/**
	 * 是否已同意退、换货：0=待处理，1=已同意，2=已拒绝
	 */
	public void setIsAgree(java.lang.Integer isAgree) {
		set("is_agree", isAgree);
	}
	
	/**
	 * 是否已同意退、换货：0=待处理，1=已同意，2=已拒绝
	 */
	public java.lang.Integer getIsAgree() {
		return getInt("is_agree");
	}

	/**
	 * 用户已发货：0=未发货，1=已发货
	 */
	public void setIsUserSend(java.lang.Integer isUserSend) {
		set("is_user_send", isUserSend);
	}
	
	/**
	 * 用户已发货：0=未发货，1=已发货
	 */
	public java.lang.Integer getIsUserSend() {
		return getInt("is_user_send");
	}

	/**
	 * 用户发货快递公司
	 */
	public void setUserSendExpress(java.lang.String userSendExpress) {
		set("user_send_express", userSendExpress);
	}
	
	/**
	 * 用户发货快递公司
	 */
	public java.lang.String getUserSendExpress() {
		return getStr("user_send_express");
	}

	/**
	 * 用户发货快递单号
	 */
	public void setUserSendExpressNo(java.lang.String userSendExpressNo) {
		set("user_send_express_no", userSendExpressNo);
	}
	
	/**
	 * 用户发货快递单号
	 */
	public java.lang.String getUserSendExpressNo() {
		return getStr("user_send_express_no");
	}

	/**
	 * 退货 换货地址id
	 */
	public void setAddressId(java.lang.Integer addressId) {
		set("address_id", addressId);
	}
	
	/**
	 * 退货 换货地址id
	 */
	public java.lang.Integer getAddressId() {
		return getInt("address_id");
	}

}