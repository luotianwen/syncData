package com.yoyound.sync.data.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 用户类型：0=管理员，1=普通用户
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	/**
	 * 用户类型：0=管理员，1=普通用户
	 */
	public java.lang.Integer getType() {
		return getInt("type");
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

	/**
	 * 微信openid
	 */
	public void setWechatOpenId(java.lang.String wechatOpenId) {
		set("wechat_open_id", wechatOpenId);
	}
	
	/**
	 * 微信openid
	 */
	public java.lang.String getWechatOpenId() {
		return getStr("wechat_open_id");
	}

	/**
	 * 微信用户union id
	 */
	public void setWechatUnionId(java.lang.String wechatUnionId) {
		set("wechat_union_id", wechatUnionId);
	}
	
	/**
	 * 微信用户union id
	 */
	public java.lang.String getWechatUnionId() {
		return getStr("wechat_union_id");
	}

	/**
	 * 昵称
	 */
	public void setNickname(java.lang.String nickname) {
		set("nickname", nickname);
	}
	
	/**
	 * 昵称
	 */
	public java.lang.String getNickname() {
		return getStr("nickname");
	}

	public void setAvatarUrl(java.lang.String avatarUrl) {
		set("avatar_url", avatarUrl);
	}
	
	public java.lang.String getAvatarUrl() {
		return getStr("avatar_url");
	}

	/**
	 * 商城id
	 */
	public void setStoreId(java.lang.Integer storeId) {
		set("store_id", storeId);
	}
	
	/**
	 * 商城id
	 */
	public java.lang.Integer getStoreId() {
		return getInt("store_id");
	}

	/**
	 * 是否是分销商 0--不是 1--是 2--申请中
	 */
	public void setIsDistributor(java.lang.Integer isDistributor) {
		set("is_distributor", isDistributor);
	}
	
	/**
	 * 是否是分销商 0--不是 1--是 2--申请中
	 */
	public java.lang.Integer getIsDistributor() {
		return getInt("is_distributor");
	}

	/**
	 * 父级ID
	 */
	public void setParentId(java.lang.Integer parentId) {
		set("parent_id", parentId);
	}
	
	/**
	 * 父级ID
	 */
	public java.lang.Integer getParentId() {
		return getInt("parent_id");
	}

	/**
	 * 成为分销商的时间
	 */
	public void setTime(java.lang.Integer time) {
		set("time", time);
	}
	
	/**
	 * 成为分销商的时间
	 */
	public java.lang.Integer getTime() {
		return getInt("time");
	}

	/**
	 * 累计佣金
	 */
	public void setTotalPrice(java.math.BigDecimal totalPrice) {
		set("total_price", totalPrice);
	}
	
	/**
	 * 累计佣金
	 */
	public java.math.BigDecimal getTotalPrice() {
		return get("total_price");
	}

	/**
	 * 可提现佣金
	 */
	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}
	
	/**
	 * 可提现佣金
	 */
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	/**
	 * 是否是核销员 0--不是 1--是
	 */
	public void setIsClerk(java.lang.Integer isClerk) {
		set("is_clerk", isClerk);
	}
	
	/**
	 * 是否是核销员 0--不是 1--是
	 */
	public java.lang.Integer getIsClerk() {
		return getInt("is_clerk");
	}

	/**
	 * 微擎账户id
	 */
	public void setWe7Uid(java.lang.Integer we7Uid) {
		set("we7_uid", we7Uid);
	}
	
	/**
	 * 微擎账户id
	 */
	public java.lang.Integer getWe7Uid() {
		return getInt("we7_uid");
	}

	public void setShopId(java.lang.Integer shopId) {
		set("shop_id", shopId);
	}
	
	public java.lang.Integer getShopId() {
		return getInt("shop_id");
	}

	/**
	 * 会员等级
	 */
	public void setLevel(java.lang.Integer level) {
		set("level", level);
	}
	
	/**
	 * 会员等级
	 */
	public java.lang.Integer getLevel() {
		return getInt("level");
	}

	/**
	 * 用户当前积分
	 */
	public void setIntegral(java.lang.Long integral) {
		set("integral", integral);
	}
	
	/**
	 * 用户当前积分
	 */
	public java.lang.Long getIntegral() {
		return getLong("integral");
	}

	/**
	 * 用户总获得积分
	 */
	public void setTotalIntegral(java.lang.Long totalIntegral) {
		set("total_integral", totalIntegral);
	}
	
	/**
	 * 用户总获得积分
	 */
	public java.lang.Long getTotalIntegral() {
		return getLong("total_integral");
	}

	/**
	 * 余额
	 */
	public void setMoney(java.math.BigDecimal money) {
		set("money", money);
	}
	
	/**
	 * 余额
	 */
	public java.math.BigDecimal getMoney() {
		return get("money");
	}

	/**
	 * 联系方式
	 */
	public void setContactWay(java.lang.String contactWay) {
		set("contact_way", contactWay);
	}
	
	/**
	 * 联系方式
	 */
	public java.lang.String getContactWay() {
		return getStr("contact_way");
	}

	/**
	 * 备注
	 */
	public void setComments(java.lang.String comments) {
		set("comments", comments);
	}
	
	/**
	 * 备注
	 */
	public java.lang.String getComments() {
		return getStr("comments");
	}

	/**
	 * 授权手机号
	 */
	public void setBinding(java.lang.String binding) {
		set("binding", binding);
	}
	
	/**
	 * 授权手机号
	 */
	public java.lang.String getBinding() {
		return getStr("binding");
	}

	/**
	 * 微信公众号openid
	 */
	public void setWechatPlatformOpenId(java.lang.String wechatPlatformOpenId) {
		set("wechat_platform_open_id", wechatPlatformOpenId);
	}
	
	/**
	 * 微信公众号openid
	 */
	public java.lang.String getWechatPlatformOpenId() {
		return getStr("wechat_platform_open_id");
	}

	/**
	 * 小程序平台 0 => 微信, 1 => 支付宝
	 */
	public void setPlatform(java.lang.Integer platform) {
		set("platform", platform);
	}
	
	/**
	 * 小程序平台 0 => 微信, 1 => 支付宝
	 */
	public java.lang.Integer getPlatform() {
		return getInt("platform");
	}

	/**
	 * 黑名单 0.否 | 1.是
	 */
	public void setBlacklist(java.lang.Boolean blacklist) {
		set("blacklist", blacklist);
	}
	
	/**
	 * 黑名单 0.否 | 1.是
	 */
	public java.lang.Boolean getBlacklist() {
		return get("blacklist");
	}

	/**
	 * 可能成为上级的ID
	 */
	public void setParentUserId(java.lang.Integer parentUserId) {
		set("parent_user_id", parentUserId);
	}
	
	/**
	 * 可能成为上级的ID
	 */
	public java.lang.Integer getParentUserId() {
		return getInt("parent_user_id");
	}

}
