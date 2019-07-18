/** 
 * @Title: Analyse.java 
 * @Package com.bei.tally.entity 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年7月5日 下午1:55:05 
 * @version V1.0 
 */
package com.bei.tally.entity;

import java.math.BigDecimal;

/**
 * @ClassName: Analyse
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年7月5日 下午1:55:05
 * 
 */
public class Analyse {
	/**
	 * 产品名称
	 */
	private String productName;
	/**
	 * 数量
	 */
	private Integer storeNumber;

	/**
	 * 单价
	 */
	private BigDecimal storePrice;

	/**
	 * 总计
	 */
	private BigDecimal storeCount;

	/**
	 * 类别名称
	 */
	private String typeName;

	/**
	 * 单价
	 */
	private BigDecimal costPrice;

	/**
	 * 费用
	 */
	private BigDecimal costMoney;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(Integer storeNumber) {
		this.storeNumber = storeNumber;
	}

	public BigDecimal getStorePrice() {
		return storePrice;
	}

	public void setStorePrice(BigDecimal storePrice) {
		this.storePrice = storePrice;
	}

	public BigDecimal getStoreCount() {
		return storeCount;
	}

	public void setStoreCount(BigDecimal storeCount) {
		this.storeCount = storeCount;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getCostMoney() {
		return costMoney;
	}

	public void setCostMoney(BigDecimal costMoney) {
		this.costMoney = costMoney;
	}

}
