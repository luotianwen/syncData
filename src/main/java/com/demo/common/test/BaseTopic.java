package com.demo.common.test;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTopic<M extends BaseTopic<M>> extends Model<M> implements IBean {

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
	 * 标题
	 */
	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	/**
	 * 标题
	 */
	public java.lang.String getTitle() {
		return getStr("title");
	}

	/**
	 * 副标题
	 */
	public void setSubTitle(java.lang.String subTitle) {
		set("sub_title", subTitle);
	}
	
	/**
	 * 副标题
	 */
	public java.lang.String getSubTitle() {
		return getStr("sub_title");
	}

	/**
	 * 封面图片
	 */
	public void setCoverPic(java.lang.String coverPic) {
		set("cover_pic", coverPic);
	}
	
	/**
	 * 封面图片
	 */
	public java.lang.String getCoverPic() {
		return getStr("cover_pic");
	}

	/**
	 * 专题内容
	 */
	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	/**
	 * 专题内容
	 */
	public java.lang.String getContent() {
		return getStr("content");
	}

	/**
	 * 阅读量
	 */
	public void setReadCount(java.lang.Integer readCount) {
		set("read_count", readCount);
	}
	
	/**
	 * 阅读量
	 */
	public java.lang.Integer getReadCount() {
		return getInt("read_count");
	}

	/**
	 * 虚拟阅读量
	 */
	public void setVirtualReadCount(java.lang.Integer virtualReadCount) {
		set("virtual_read_count", virtualReadCount);
	}
	
	/**
	 * 虚拟阅读量
	 */
	public java.lang.Integer getVirtualReadCount() {
		return getInt("virtual_read_count");
	}

	/**
	 * 布局方式：0=小图，1=大图模式
	 */
	public void setLayout(java.lang.Integer layout) {
		set("layout", layout);
	}
	
	/**
	 * 布局方式：0=小图，1=大图模式
	 */
	public java.lang.Integer getLayout() {
		return getInt("layout");
	}

	/**
	 * 排序：升序
	 */
	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}
	
	/**
	 * 排序：升序
	 */
	public java.lang.Integer getSort() {
		return getInt("sort");
	}

	/**
	 * 点赞数
	 */
	public void setAgreeCount(java.lang.Integer agreeCount) {
		set("agree_count", agreeCount);
	}
	
	/**
	 * 点赞数
	 */
	public java.lang.Integer getAgreeCount() {
		return getInt("agree_count");
	}

	/**
	 * 虚拟点赞数
	 */
	public void setVirtualAgreeCount(java.lang.Integer virtualAgreeCount) {
		set("virtual_agree_count", virtualAgreeCount);
	}
	
	/**
	 * 虚拟点赞数
	 */
	public java.lang.Integer getVirtualAgreeCount() {
		return getInt("virtual_agree_count");
	}

	/**
	 * 虚拟收藏量
	 */
	public void setVirtualFavoriteCount(java.lang.Integer virtualFavoriteCount) {
		set("virtual_favorite_count", virtualFavoriteCount);
	}
	
	/**
	 * 虚拟收藏量
	 */
	public java.lang.Integer getVirtualFavoriteCount() {
		return getInt("virtual_favorite_count");
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

	public void setIsChosen(java.lang.Integer isChosen) {
		set("is_chosen", isChosen);
	}
	
	public java.lang.Integer getIsChosen() {
		return getInt("is_chosen");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	 * 海报分享图
	 */
	public void setQrcodePic(java.lang.String qrcodePic) {
		set("qrcode_pic", qrcodePic);
	}
	
	/**
	 * 海报分享图
	 */
	public java.lang.String getQrcodePic() {
		return getStr("qrcode_pic");
	}

}
