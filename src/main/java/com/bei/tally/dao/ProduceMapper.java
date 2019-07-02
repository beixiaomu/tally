package com.bei.tally.dao;

import java.util.List;

import com.bei.tally.entity.Produce;

public interface ProduceMapper {
    /**
     *
     * @mbggenerated 2019-06-28
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int insert(Produce record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int insertSelective(Produce record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    Produce selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int updateByPrimaryKeySelective(Produce record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int updateByPrimaryKey(Produce record);

	/** 
	 * @Title: findList 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param entity
	 * @param @return 设定文件 
	 * @return List<Produce> 返回类型 
	 * @throws 
	 */ 
	List<Produce> findList(Produce entity);
}