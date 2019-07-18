package com.bei.tally.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bei.tally.entity.Analyse;
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

	Analyse findAnalyseOne(@Param("id") Integer id);

	List<Analyse> findAnalyse(@Param("id") Integer id);

	Analyse findCount(@Param("id") Integer id);
}