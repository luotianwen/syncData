package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseYyOrder<M extends BaseYyOrder<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	/**
	 * 商品id
	 */
	public void setGoodsId(java.lang.Long goodsId) {
		set("goods_id", goodsId);
	}
	
	/**
	 * 商品id
	 */
	public java.lang.Long getGoodsId() {
		return getLong("goods_id");
	}

	/**
	 * 用户id
	 */
	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	/**
	 * 用户id
	 */
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	/**
	 * 订单号
	 */
	public void setOrderNo(java.lang.String orderNo) {
		set("order_no", orderNo);
	}
	
	/**
	 * 订单号
	 */
	public java.lang.String getOrderNo() {
		return getStr("order_no");
	}

	/**
	 * 订单总费用
	 */
	public void setTotalPrice(java.math.BigDecimal totalPrice) {
		set("total_price", totalPrice);
	}
	
	/**
	 * 订单总费用
	 */
	public java.math.BigDecimal getTotalPrice() {
		return get("total_price");
	}

	/**
	 * 实际支付总费用
	 */
	public void setPayPrice(java.math.BigDecimal payPrice) {
		set("pay_price", payPrice);
	}
	
	/**
	 * 实际支付总费用
	 */
	public java.math.BigDecimal getPayPrice() {
		return get("pay_price");
	}

	/**
	 * 支付状态：0=未支付，1=已支付
	 */
	public void setIsPay(java.lang.Integer isPay) {
		set("is_pay", isPay);
	}
	
	/**
	 * 支付状态：0=未支付，1=已支付
	 */
	public java.lang.Integer getIsPay() {
		return getInt("is_pay");
	}

	/**
	 * 支付方式：1=微信支付
	 */
	public void setPayType(java.lang.Integer payType) {
		set("pay_type", payType);
	}
	
	/**
	 * 支付方式：1=微信支付
	 */
	public java.lang.Integer getPayType() {
		return getInt("pay_type");
	}

	/**
	 * 支付时间
	 */
	public void setPayTime(java.lang.Long payTime) {
		set("pay_time", payTime);
	}
	
	/**
	 * 支付时间
	 */
	public java.lang.Long getPayTime() {
		return getLong("pay_time");
	}

	/**
	 * 是否使用
	 */
	public void setIsUse(java.lang.Integer isUse) {
		set("is_use", isUse);
	}
	
	/**
	 * 是否使用
	 */
	public java.lang.Integer getIsUse() {
		return getInt("is_use");
	}

	/**
	 * 是否评论
	 */
	public void setIsComment(java.lang.Long isComment) {
		set("is_comment", isComment);
	}
	
	/**
	 * 是否评论
	 */
	public java.lang.Long getIsComment() {
		return getLong("is_comment");
	}

	/**
	 * 是否申请取消订单：0=否，1=申请取消订单
	 */
	public void setApplyDelete(java.lang.Integer applyDelete) {
		set("apply_delete", applyDelete);
	}
	
	/**
	 * 是否申请取消订单：0=否，1=申请取消订单
	 */
	public java.lang.Integer getApplyDelete() {
		return getInt("apply_delete");
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
	 * 核销码
	 */
	public void setOfflineQrcode(java.lang.String offlineQrcode) {
		set("offline_qrcode", offlineQrcode);
	}
	
	/**
	 * 核销码
	 */
	public java.lang.String getOfflineQrcode() {
		return getStr("offline_qrcode");
	}

	/**
	 * 是否取消
	 */
	public void setIsCancel(java.lang.Integer isCancel) {
		set("is_cancel", isCancel);
	}
	
	/**
	 * 是否取消
	 */
	public java.lang.Integer getIsCancel() {
		return getInt("is_cancel");
	}

	public void setStoreId(java.lang.Long storeId) {
		set("store_id", storeId);
	}
	
	public java.lang.Long getStoreId() {
		return getLong("store_id");
	}

	/**
	 * 核销时间
	 */
	public void setUseTime(java.lang.Long useTime) {
		set("use_time", useTime);
	}
	
	/**
	 * 核销时间
	 */
	public java.lang.Long getUseTime() {
		return getLong("use_time");
	}

	/**
	 * 核销员user_id
	 */
	public void setClerkId(java.lang.Long clerkId) {
		set("clerk_id", clerkId);
	}
	
	/**
	 * 核销员user_id
	 */
	public java.lang.Long getClerkId() {
		return getLong("clerk_id");
	}

	/**
	 * 自提门店ID
	 */
	public void setShopId(java.lang.Long shopId) {
		set("shop_id", shopId);
	}
	
	/**
	 * 自提门店ID
	 */
	public java.lang.Long getShopId() {
		return getLong("shop_id");
	}

	/**
	 * 是否取消
	 */
	public void setIsRefund(java.lang.Integer isRefund) {
		set("is_refund", isRefund);
	}
	
	/**
	 * 是否取消
	 */
	public java.lang.Integer getIsRefund() {
		return getInt("is_refund");
	}

	/**
	 * 表单ID
	 */
	public void setFormId(java.lang.String formId) {
		set("form_id", formId);
	}
	
	/**
	 * 表单ID
	 */
	public java.lang.String getFormId() {
		return getStr("form_id");
	}

	/**
	 * 取消时间
	 */
	public void setRefundTime(java.lang.Integer refundTime) {
		set("refund_time", refundTime);
	}
	
	/**
	 * 取消时间
	 */
	public java.lang.Integer getRefundTime() {
		return getInt("refund_time");
	}

	/**
	 * 是否加入回收站 0--不加入 1--加入
	 */
	public void setIsRecycle(java.lang.Integer isRecycle) {
		set("is_recycle", isRecycle);
	}
	
	/**
	 * 是否加入回收站 0--不加入 1--加入
	 */
	public java.lang.Integer getIsRecycle() {
		return getInt("is_recycle");
	}

	/**
	 * 是否显示 0--不显示 1--显示（软删除）
	 */
	public void setIsShow(java.lang.Integer isShow) {
		set("is_show", isShow);
	}
	
	/**
	 * 是否显示 0--不显示 1--显示（软删除）
	 */
	public java.lang.Integer getIsShow() {
		return getInt("is_show");
	}

	/**
	 * 商家备注
	 */
	public void setSellerComments(java.lang.String sellerComments) {
		set("seller_comments", sellerComments);
	}
	
	/**
	 * 商家备注
	 */
	public java.lang.String getSellerComments() {
		return getStr("seller_comments");
	}

	/**
	 * 规格
	 */
	public void setAttr(java.lang.String attr) {
		set("attr", attr);
	}
	
	/**
	 * 规格
	 */
	public java.lang.String getAttr() {
		return getStr("attr");
	}

}
