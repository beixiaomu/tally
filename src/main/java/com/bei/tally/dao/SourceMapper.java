package com.bei.tally.dao;

import java.util.List;

import com.bei.tally.entity.Source;

public interface SourceMapper {
	/**
	 *
	 * @mbggenerated 2019-07-05
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 *
	 * @mbggenerated 2019-07-05
	 */
	int insert(Source record);

	/**
	 *
	 * @mbggenerated 2019-07-05
	 */
	int insertSelective(Source record);

	/**
	 *
	 * @mbggenerated 2019-07-05
	 */
	Source selectByPrimaryKey(Integer id);

	/**
	 *
	 * @mbggenerated 2019-07-05
	 */
	int updateByPrimaryKeySelective(Source record);

	/**
	 *
	 * @mbggenerated 2019-07-05
	 */
	int updateByPrimaryKey(Source record);

	List<Source> findList(Source entity);
}