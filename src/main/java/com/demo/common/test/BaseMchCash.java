package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMchCash<M extends BaseMchCash<M>> extends Model<M> implements IBean {

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

	public void setMchId(java.lang.Integer mchId) {
		set("mch_id", mchId);
	}
	
	public java.lang.Integer getMchId() {
		return getInt("mch_id");
	}

	public void setMoney(java.math.BigDecimal money) {
		set("money", money);
	}
	
	public java.math.BigDecimal getMoney() {
		return get("money");
	}

	public void setOrderNo(java.lang.String orderNo) {
		set("order_no", orderNo);
	}
	
	public java.lang.String getOrderNo() {
		return getStr("order_no");
	}

	/**
	 * 提现状态：0=待处理，1=已转账，2=已拒绝
	 */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	/**
	 * 提现状态：0=待处理，1=已转账，2=已拒绝
	 */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setAddtime(java.lang.Integer addtime) {
		set("addtime", addtime);
	}
	
	public java.lang.Integer getAddtime() {
		return getInt("addtime");
	}

	/**
	 * 提现类型 0--微信自动打款 1--微信线下打款 2--支付宝线下打款 3--银行卡线下打款 4--充值到余额
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	/**
	 * 提现类型 0--微信自动打款 1--微信线下打款 2--支付宝线下打款 3--银行卡线下打款 4--充值到余额
	 */
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	 * 不同提现类型，提交的数据
	 */
	public void setTypeData(java.lang.String typeData) {
		set("type_data", typeData);
	}
	
	/**
	 * 不同提现类型，提交的数据
	 */
	public java.lang.String getTypeData() {
		return getStr("type_data");
	}

	/**
	 * 实际上打款方式
	 */
	public void setVirtualType(java.lang.Integer virtualType) {
		set("virtual_type", virtualType);
	}
	
	/**
	 * 实际上打款方式
	 */
	public java.lang.Integer getVirtualType() {
		return getInt("virtual_type");
	}

}
