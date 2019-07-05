package com.bei.tally.dao;

import java.util.List;

import com.bei.tally.entity.Store;

public interface StoreMapper {
	/**
	 *
	 * @mbggenerated 2019-06-28
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 *
	 * @mbggenerated 2019-06-28
	 */
	int insert(Store record);

	/**
	 *
	 * @mbggenerated 2019-06-28
	 */
	int insertSelective(Store record);

	/**
	 *
	 * @mbggenerated 2019-06-28
	 */
	Store selectByPrimaryKey(Integer id);

	/**
	 *
	 * @mbggenerated 2019-06-28
	 */
	int updateByPrimaryKeySelective(Store record);

	/**
	 *
	 * @mbggenerated 2019-06-28
	 */
	int updateByPrimaryKey(Store record);

	List<Store> findList(Store entity);
}