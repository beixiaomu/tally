package com.bei.tally.dao;

import com.bei.tally.entity.Cost;

public interface CostMapper {
    /**
     *
     * @mbggenerated 2019-06-28
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int insert(Cost record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int insertSelective(Cost record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    Cost selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int updateByPrimaryKeySelective(Cost record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int updateByPrimaryKey(Cost record);
}