package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOrderDetail<M extends BaseOrderDetail<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setOrderId(java.lang.Integer orderId) {
		set("order_id", orderId);
	}
	
	public java.lang.Integer getOrderId() {
		return getInt("order_id");
	}

	public void setGoodsId(java.lang.Integer goodsId) {
		set("goods_id", goodsId);
	}
	
	public java.lang.Integer getGoodsId() {
		return getInt("goods_id");
	}

	/**
	 * 商品数量
	 */
	public void setNum(java.lang.Integer num) {
		set("num", num);
	}
	
	/**
	 * 商品数量
	 */
	public java.lang.Integer getNum() {
		return getInt("num");
	}

	/**
	 * 此商品的总价
	 */
	public void setTotalPrice(java.math.BigDecimal totalPrice) {
		set("total_price", totalPrice);
	}
	
	/**
	 * 此商品的总价
	 */
	public java.math.BigDecimal getTotalPrice() {
		return get("total_price");
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
	 * 商品规格
	 */
	public void setAttr(java.lang.String attr) {
		set("attr", attr);
	}
	
	/**
	 * 商品规格
	 */
	public java.lang.String getAttr() {
		return getStr("attr");
	}

	/**
	 * 商品规格图片
	 */
	public void setPic(java.lang.String pic) {
		set("pic", pic);
	}
	
	/**
	 * 商品规格图片
	 */
	public java.lang.String getPic() {
		return getStr("pic");
	}

	/**
	 * 单品积分获得
	 */
	public void setIntegral(java.lang.Long integral) {
		set("integral", integral);
	}
	
	/**
	 * 单品积分获得
	 */
	public java.lang.Long getIntegral() {
		return getLong("integral");
	}

	/**
	 * 是否使用会员折扣 0--不适用 1--使用
	 */
	public void setIsLevel(java.lang.Integer isLevel) {
		set("is_level", isLevel);
	}
	
	/**
	 * 是否使用会员折扣 0--不适用 1--使用
	 */
	public java.lang.Integer getIsLevel() {
		return getInt("is_level");
	}

}