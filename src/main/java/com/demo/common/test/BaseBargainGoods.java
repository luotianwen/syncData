package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBargainGoods<M extends BaseBargainGoods<M>> extends Model<M> implements IBean {

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

	public void setGoodsId(java.lang.Integer goodsId) {
		set("goods_id", goodsId);
	}
	
	public java.lang.Integer getGoodsId() {
		return getInt("goods_id");
	}

	/**
	 * 最低价
	 */
	public void setMinPrice(java.math.BigDecimal minPrice) {
		set("min_price", minPrice);
	}
	
	/**
	 * 最低价
	 */
	public java.math.BigDecimal getMinPrice() {
		return get("min_price");
	}

	/**
	 * 活动开始时间
	 */
	public void setBeginTime(java.lang.Integer beginTime) {
		set("begin_time", beginTime);
	}
	
	/**
	 * 活动开始时间
	 */
	public java.lang.Integer getBeginTime() {
		return getInt("begin_time");
	}

	/**
	 * 活动结束时间
	 */
	public void setEndTime(java.lang.Integer endTime) {
		set("end_time", endTime);
	}
	
	/**
	 * 活动结束时间
	 */
	public java.lang.Integer getEndTime() {
		return getInt("end_time");
	}

	/**
	 * 砍价小时数
	 */
	public void setTime(java.lang.Integer time) {
		set("time", time);
	}
	
	/**
	 * 砍价小时数
	 */
	public java.lang.Integer getTime() {
		return getInt("time");
	}

	/**
	 * 砍价方式 0--按人数 1--按价格
	 */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	/**
	 * 砍价方式 0--按人数 1--按价格
	 */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	 * 砍价方式数据
	 */
	public void setStatusData(java.lang.String statusData) {
		set("status_data", statusData);
	}
	
	/**
	 * 砍价方式数据
	 */
	public java.lang.String getStatusData() {
		return getStr("status_data");
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

}
