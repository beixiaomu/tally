package com.bei.tally.entity;

import java.util.Date;

public class Produce {
	/**
	 * 产品主键
	 */
	private Integer id;

	/**
	 * 产品名称
	 */
	private String productName;

	/**
	 * 产品大类
	 */
	private Integer productType;

	/**
	 * 成本
	 */
	private String productCost;

	/**
	 * 删除标记
	 */
	private String delFlag;

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
	private Date createDate;

	/**
	 * 更新人
	 */
	private String updateBy;

	/**
	 * 更新时间
	 */
	private Date updateDate;
	private Date beginCreateDate; // 开始 消费时间
	private Date endCreateDate; // 结束 消费时间

	/**
	 * 产品主键
	 * 
	 * @return id 产品主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 产品主键
	 * 
	 * @param id
	 *            产品主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 产品名称
	 * 
	 * @return product_name 产品名称
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 产品名称
	 * 
	 * @param productName
	 *            产品名称
	 */
	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	/**
	 * 产品大类
	 * 
	 * @return product_type 产品大类
	 */
	public Integer getProductType() {
		return productType;
	}

	/**
	 * 产品大类
	 * 
	 * @param productType
	 *            产品大类
	 */
	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	/**
	 * 成本
	 * 
	 * @return product_cost 成本
	 */
	public String getProductCost() {
		return productCost;
	}

	/**
	 * 成本
	 * 
	 * @param productCost
	 *            成本
	 */
	public void setProductCost(String productCost) {
		this.productCost = productCost == null ? null : productCost.trim();
	}

	/**
	 * 删除标记
	 * 
	 * @return del_flag 删除标记
	 */
	public String getDelFlag() {
		return delFlag;
	}

	/**
	 * 删除标记
	 * 
	 * @param delFlag
	 *            删除标记
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag == null ? null : delFlag.trim();
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