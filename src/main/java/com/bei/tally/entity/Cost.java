package com.bei.tally.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Cost {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 类别id
     */
    private String costId;

    /**
     * 单价
     */
    private BigDecimal costPrice;

    /**
     * 费用
     */
    private BigDecimal costMoney;

    /**
     * 备注，说明
     */
    private String remark;

    /**
     * 删除标记
     */
    private Integer delFlag;

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

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 类别id
     * @return cost_id 类别id
     */
    public String getCostId() {
        return costId;
    }

    /**
     * 类别id
     * @param costId 类别id
     */
    public void setCostId(String costId) {
        this.costId = costId == null ? null : costId.trim();
    }

    /**
     * 单价
     * @return cost_price 单价
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * 单价
     * @param costPrice 单价
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 费用
     * @return cost_money 费用
     */
    public BigDecimal getCostMoney() {
        return costMoney;
    }

    /**
     * 费用
     * @param costMoney 费用
     */
    public void setCostMoney(BigDecimal costMoney) {
        this.costMoney = costMoney;
    }

    /**
     * 备注，说明
     * @return remark 备注，说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注，说明
     * @param remark 备注，说明
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 删除标记
     * @return del_flag 删除标记
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 删除标记
     * @param delFlag 删除标记
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 创建人
     * @return create_by 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新人
     * @return update_by 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新人
     * @param updateBy 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 更新时间
     * @return update_date 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}