package com.bei.tally.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FileUpload {
	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 文件标题
	 */
	private String tFileTitle;

	/**
	 * 上传文件url
	 */
	private String tFileUrl;

	/**
	 * 文件大小
	 */
	private String tFileSize;

	/**
	 * 文件类型
	 */
	private String tFileType;

	/**
	 * 文件描述
	 */
	private String tFileDescribe;

	/**
	 * 文件下载次数
	 */
	private String tFileCount;

	/**
	 * 创建人
	 */
	private Integer tCreateBy;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date tCreateDate;

	/**
	 * 更新人
	 */
	private Integer tUpdateBy;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date tUpdateDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date beginCreateDate; // 开始 消费时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endCreateDate; // 结束 消费时间
	/**
	 * 预留字段1
	 */
	private String tReserved1;

	/**
	 * 预留字段2
	 */
	private String tReserved2;

	/**
	 * 预留字段3
	 */
	private String tReserved3;

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
	 * 文件标题
	 * 
	 * @return t_file_title 文件标题
	 */
	public String gettFileTitle() {
		return tFileTitle;
	}

	/**
	 * 文件标题
	 * 
	 * @param tFileTitle
	 *            文件标题
	 */
	public void settFileTitle(String tFileTitle) {
		this.tFileTitle = tFileTitle == null ? null : tFileTitle.trim();
	}

	/**
	 * 上传文件url
	 * 
	 * @return t_file_url 上传文件url
	 */
	public String gettFileUrl() {
		return tFileUrl;
	}

	/**
	 * 上传文件url
	 * 
	 * @param tFileUrl
	 *            上传文件url
	 */
	public void settFileUrl(String tFileUrl) {
		this.tFileUrl = tFileUrl == null ? null : tFileUrl.trim();
	}

	/**
	 * 文件大小
	 * 
	 * @return t_file_size 文件大小
	 */
	public String gettFileSize() {
		return tFileSize;
	}

	/**
	 * 文件大小
	 * 
	 * @param tFileSize
	 *            文件大小
	 */
	public void settFileSize(String tFileSize) {
		this.tFileSize = tFileSize == null ? null : tFileSize.trim();
	}

	/**
	 * 文件类型
	 * 
	 * @return t_file_type 文件类型
	 */
	public String gettFileType() {
		return tFileType;
	}

	/**
	 * 文件类型
	 * 
	 * @param tFileType
	 *            文件类型
	 */
	public void settFileType(String tFileType) {
		this.tFileType = tFileType == null ? null : tFileType.trim();
	}

	/**
	 * 文件描述
	 * 
	 * @return t_file_describe 文件描述
	 */
	public String gettFileDescribe() {
		return tFileDescribe;
	}

	/**
	 * 文件描述
	 * 
	 * @param tFileDescribe
	 *            文件描述
	 */
	public void settFileDescribe(String tFileDescribe) {
		this.tFileDescribe = tFileDescribe == null ? null : tFileDescribe.trim();
	}

	/**
	 * 文件下载次数
	 * 
	 * @return t_file_count 文件下载次数
	 */
	public String gettFileCount() {
		return tFileCount;
	}

	/**
	 * 文件下载次数
	 * 
	 * @param tFileCount
	 *            文件下载次数
	 */
	public void settFileCount(String tFileCount) {
		this.tFileCount = tFileCount == null ? null : tFileCount.trim();
	}

	/**
	 * 创建人
	 * 
	 * @return t_create_by 创建人
	 */
	public Integer gettCreateBy() {
		return tCreateBy;
	}

	/**
	 * 创建人
	 * 
	 * @param tCreateBy
	 *            创建人
	 */
	public void settCreateBy(Integer tCreateBy) {
		this.tCreateBy = tCreateBy;
	}

	/**
	 * 创建时间
	 * 
	 * @return t_create_date 创建时间
	 */
	public Date gettCreateDate() {
		return tCreateDate;
	}

	/**
	 * 创建时间
	 * 
	 * @param tCreateDate
	 *            创建时间
	 */
	public void settCreateDate(Date tCreateDate) {
		this.tCreateDate = tCreateDate;
	}

	/**
	 * 更新人
	 * 
	 * @return t_update_by 更新人
	 */
	public Integer gettUpdateBy() {
		return tUpdateBy;
	}

	/**
	 * 更新人
	 * 
	 * @param tUpdateBy
	 *            更新人
	 */
	public void settUpdateBy(Integer tUpdateBy) {
		this.tUpdateBy = tUpdateBy;
	}

	/**
	 * 更新时间
	 * 
	 * @return t_update_date 更新时间
	 */
	public Date gettUpdateDate() {
		return tUpdateDate;
	}

	/**
	 * 更新时间
	 * 
	 * @param tUpdateDate
	 *            更新时间
	 */
	public void settUpdateDate(Date tUpdateDate) {
		this.tUpdateDate = tUpdateDate;
	}

	/**
	 * 预留字段1
	 * 
	 * @return t_reserved1 预留字段1
	 */
	public String gettReserved1() {
		return tReserved1;
	}

	/**
	 * 预留字段1
	 * 
	 * @param tReserved1
	 *            预留字段1
	 */
	public void settReserved1(String tReserved1) {
		this.tReserved1 = tReserved1 == null ? null : tReserved1.trim();
	}

	/**
	 * 预留字段2
	 * 
	 * @return t_reserved2 预留字段2
	 */
	public String gettReserved2() {
		return tReserved2;
	}

	/**
	 * 预留字段2
	 * 
	 * @param tReserved2
	 *            预留字段2
	 */
	public void settReserved2(String tReserved2) {
		this.tReserved2 = tReserved2 == null ? null : tReserved2.trim();
	}

	/**
	 * 预留字段3
	 * 
	 * @return t_reserved3 预留字段3
	 */
	public String gettReserved3() {
		return tReserved3;
	}

	/**
	 * 预留字段3
	 * 
	 * @param tReserved3
	 *            预留字段3
	 */
	public void settReserved3(String tReserved3) {
		this.tReserved3 = tReserved3 == null ? null : tReserved3.trim();
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