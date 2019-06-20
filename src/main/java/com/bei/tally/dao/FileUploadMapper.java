package com.bei.tally.dao;

import com.bei.tally.entity.FileUpload;

public interface FileUploadMapper {
    /**
     *
     * @mbggenerated 2019-05-10
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-05-10
     */
    int insert(FileUpload record);

    /**
     *
     * @mbggenerated 2019-05-10
     */
    int insertSelective(FileUpload record);

    /**
     *
     * @mbggenerated 2019-05-10
     */
    FileUpload selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-05-10
     */
    int updateByPrimaryKeySelective(FileUpload record);

    /**
     *
     * @mbggenerated 2019-05-10
     */
    int updateByPrimaryKey(FileUpload record);
}