package com.bei.tally.dao;

import java.util.List;

import com.bei.tally.entity.FileUpload;

public interface FileUploadMapper {
	/**
	 *
	 * @mbggenerated 2019-07-18
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 *
	 * @mbggenerated 2019-07-18
	 */
	int insert(FileUpload record);

	/**
	 *
	 * @mbggenerated 2019-07-18
	 */
	int insertSelective(FileUpload record);

	/**
	 *
	 * @mbggenerated 2019-07-18
	 */
	FileUpload selectByPrimaryKey(Integer id);

	/**
	 *
	 * @mbggenerated 2019-07-18
	 */
	int updateByPrimaryKeySelective(FileUpload record);

	/**
	 *
	 * @mbggenerated 2019-07-18
	 */
	int updateByPrimaryKey(FileUpload record);

	List<FileUpload> findList(FileUpload record);
}