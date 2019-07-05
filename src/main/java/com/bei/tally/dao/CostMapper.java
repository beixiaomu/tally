package com.bei.tally.dao;

import java.util.List;

import com.bei.tally.entity.Cost;

public interface CostMapper {
	/**
	 *
	 * @mbggenerated 2019-07-04
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 *
	 * @mbggenerated 2019-07-04
	 */
	int insert(Cost record);

	/**
	 *
	 * @mbggenerated 2019-07-04
	 */
	int insertSelective(Cost record);

	/**
	 *
	 * @mbggenerated 2019-07-04
	 */
	Cost selectByPrimaryKey(Integer id);

	/**
	 *
	 * @mbggenerated 2019-07-04
	 */
	int updateByPrimaryKeySelective(Cost record);

	/**
	 *
	 * @mbggenerated 2019-07-04
	 */
	int updateByPrimaryKey(Cost record);

	List<Cost> findList(Cost entity);
}