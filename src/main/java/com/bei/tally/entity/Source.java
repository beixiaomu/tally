package com.bei.tally.entity;

import java.util.Date;

public class Source {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 姓名
     */
    private String sourceName;

    /**
     * 手机
     */
    private String sourcePhone;

    /**
     * 地址
     */
    private String sourceAddress;

    /**
     * 数量
     */
    private Integer sourceNum;

    /**
     * 金钱
     */
    private Long sourceMoney;

    /**
     * 单价
     */
    private Long sourcePrice;

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
     * 姓名
     * @return source_name 姓名
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * 姓名
     * @param sourceName 姓名
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    /**
     * 手机
     * @return source_phone 手机
     */
    public String getSourcePhone() {
        return sourcePhone;
    }

    /**
     * 手机
     * @param sourcePhone 手机
     */
    public void setSourcePhone(String sourcePhone) {
        this.sourcePhone = sourcePhone == null ? null : sourcePhone.trim();
    }

    /**
     * 地址
     * @return source_address 地址
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * 地址
     * @param sourceAddress 地址
     */
    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress == null ? null : sourceAddress.trim();
    }

    /**
     * 数量
     * @return source_num 数量
     */
    public Integer getSourceNum() {
        return sourceNum;
    }

    /**
     * 数量
     * @param sourceNum 数量
     */
    public void setSourceNum(Integer sourceNum) {
        this.sourceNum = sourceNum;
    }

    /**
     * 金钱
     * @return source_money 金钱
     */
    public Long getSourceMoney() {
        return sourceMoney;
    }

    /**
     * 金钱
     * @param sourceMoney 金钱
     */
    public void setSourceMoney(Long sourceMoney) {
        this.sourceMoney = sourceMoney;
    }

    /**
     * 单价
     * @return source_price 单价
     */
    public Long getSourcePrice() {
        return sourcePrice;
    }

    /**
     * 单价
     * @param sourcePrice 单价
     */
    public void setSourcePrice(Long sourcePrice) {
        this.sourcePrice = sourcePrice;
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
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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