package com.bei.tally.dao;

import com.bei.tally.entity.FileUpload;

public interface FileUploadMapper {
    /**
     *
     * @mbggenerated 2019-06-28
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int insert(FileUpload record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int insertSelective(FileUpload record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    FileUpload selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int updateByPrimaryKeySelective(FileUpload record);

    /**
     *
     * @mbggenerated 2019-06-28
     */
    int updateByPrimaryKey(FileUpload record);
}