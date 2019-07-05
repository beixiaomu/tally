package com.bei.tally.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Store {
	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 产品编号
	 */
	private String productId;

	/**
	 * 入库人手机号
	 */
	private String storePhone;

	/**
	 * 入库人姓名
	 */
	private String storeName;

	/**
	 * 登记方式“1”为入存，“0”为出库
	 */
	private Integer storeStatu;

	/**
	 * 数量
	 */
	private Integer storeNumber;

	/**
	 * 质量等级
	 */
	private Integer storeQulity;

	/**
	 * 单价
	 */
	private BigDecimal storePrice;

	/**
	 * 总计
	 */
	private BigDecimal storeCount;

	/**
	 * 来源，供货方
	 */
	private String storeFrorto;

	/**
	 * 出货发方
	 */
	private String storeReason;

	/**
	 * 删除标记
	 */
	private Integer delFlag;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 创建人
	 */
	private String createBy;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;

	/**
	 * 更新人
	 */
	private String updateBy;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date beginCreateDate; // 开始 消费时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endCreateDate; // 结束 消费时间

	/**
	 * 主键
	 * 
	 * @return id 主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 主键
	 * 
	 * @param id
	 *            主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 产品编号
	 * 
	 * @return product_id 产品编号
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * 产品编号
	 * 
	 * @param productId
	 *            产品编号
	 */
	public void setProductId(String productId) {
		this.productId = productId == null ? null : productId.trim();
	}

	/**
	 * 入库人手机号
	 * 
	 * @return store_phone 入库人手机号
	 */
	public String getStorePhone() {
		return storePhone;
	}

	/**
	 * 入库人手机号
	 * 
	 * @param storePhone
	 *            入库人手机号
	 */
	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone == null ? null : storePhone.trim();
	}

	/**
	 * 入库人姓名
	 * 
	 * @return store_name 入库人姓名
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * 入库人姓名
	 * 
	 * @param storeName
	 *            入库人姓名
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName == null ? null : storeName.trim();
	}

	/**
	 * 登记方式“1”为入存，“0”为出库
	 * 
	 * @return store_statu 登记方式“1”为入存，“0”为出库
	 */
	public Integer getStoreStatu() {
		return storeStatu;
	}

	/**
	 * 登记方式“1”为入存，“0”为出库
	 * 
	 * @param storeStatu
	 *            登记方式“1”为入存，“0”为出库
	 */
	public void setStoreStatu(Integer storeStatu) {
		this.storeStatu = storeStatu;
	}

	/**
	 * 数量
	 * 
	 * @return store_number 数量
	 */
	public Integer getStoreNumber() {
		return storeNumber;
	}

	/**
	 * 数量
	 * 
	 * @param storeNumber
	 *            数量
	 */
	public void setStoreNumber(Integer storeNumber) {
		this.storeNumber = storeNumber;
	}

	/**
	 * 质量等级
	 * 
	 * @return store_qulity 质量等级
	 */
	public Integer getStoreQulity() {
		return storeQulity;
	}

	/**
	 * 质量等级
	 * 
	 * @param storeQulity
	 *            质量等级
	 */
	public void setStoreQulity(Integer storeQulity) {
		this.storeQulity = storeQulity;
	}

	/**
	 * 单价
	 * 
	 * @return store_price 单价
	 */
	public BigDecimal getStorePrice() {
		return storePrice;
	}

	/**
	 * 单价
	 * 
	 * @param storePrice
	 *            单价
	 */
	public void setStorePrice(BigDecimal storePrice) {
		this.storePrice = storePrice;
	}

	/**
	 * 总计
	 * 
	 * @return store_count 总计
	 */
	public BigDecimal getStoreCount() {
		return storeCount;
	}

	/**
	 * 总计
	 * 
	 * @param storeCount
	 *            总计
	 */
	public void setStoreCount(BigDecimal storeCount) {
		this.storeCount = storeCount;
	}

	/**
	 * 来源，供货方
	 * 
	 * @return store_frorto 来源，供货方
	 */
	public String getStoreFrorto() {
		return storeFrorto;
	}

	/**
	 * 来源，供货方
	 * 
	 * @param storeFrorto
	 *            来源，供货方
	 */
	public void setStoreFrorto(String storeFrorto) {
		this.storeFrorto = storeFrorto == null ? null : storeFrorto.trim();
	}

	/**
	 * 出货发方
	 * 
	 * @return store_reason 出货发方
	 */
	public String getStoreReason() {
		return storeReason;
	}

	/**
	 * 出货发方
	 * 
	 * @param storeReason
	 *            出货发方
	 */
	public void setStoreReason(String storeReason) {
		this.storeReason = storeReason == null ? null : storeReason.trim();
	}

	/**
	 * 删除标记
	 * 
	 * @return del_flag 删除标记
	 */
	public Integer getDelFlag() {
		return delFlag;
	}

	/**
	 * 删除标记
	 * 
	 * @param delFlag
	 *            删除标记
	 */
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	/**
	 * 备注
	 * 
	 * @return remark 备注
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注
	 * 
	 * @param remark
	 *            备注
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	/**
	 * 创建人
	 * 
	 * @return create_by 创建人
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * 创建人
	 * 
	 * @param createBy
	 *            创建人
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	/**
	 * 创建时间
	 * 
	 * @return create_date 创建时间
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 创建时间
	 * 
	 * @param createDate
	 *            创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 更新人
	 * 
	 * @return update_by 更新人
	 */
	public String getUpdateBy() {
		return updateBy;
	}

	/**
	 * 更新人
	 * 
	 * @param updateBy
	 *            更新人
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy == null ? null : updateBy.trim();
	}

	/**
	 * 更新时间
	 * 
	 * @return update_date 更新时间
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * 更新时间
	 * 
	 * @param updateDate
	 *            更新时间
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getBeginCreateDate() {
		return beginCreateDate;
	}

	public void setBeginCreateDate(Date beginCreateDate) {
		this.beginCreateDate = beginCreateDate;
	}

	public Date getEndCreateDate() {
		return endCreateDate;
	}

	public void setEndCreateDate(Date endCreateDate) {
		this.endCreateDate = endCreateDate;
	}

}