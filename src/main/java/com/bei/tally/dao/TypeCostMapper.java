package com.bei.tally.dao;

import java.util.List;

import com.bei.tally.entity.TypeCost;

public interface TypeCostMapper {
    /**
     *
     * @mbggenerated 2019-06-28
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int insert(TypeCost record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int insertSelective(TypeCost record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    TypeCost selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int updateByPrimaryKeySelective(TypeCost record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int updateByPrimaryKey(TypeCost record);
    
    List<TypeCost> findList(TypeCost entity);
}