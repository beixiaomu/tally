package com.bei.tally.dao;

import com.bei.tally.entity.Source;

public interface SourceMapper {
    /**
     *
     * @mbggenerated 2019-06-28
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int insert(Source record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int insertSelective(Source record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    Source selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int updateByPrimaryKeySelective(Source record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int updateByPrimaryKey(Source record);
}