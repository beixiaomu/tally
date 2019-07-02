package com.bei.tally.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseService<T> {

	public T get(Integer id);

	public List<T> findList(T entity);

	public int save(T entity);

	public int delete(Integer id);

	/**
	 * 查看所有的数量
	 * 
	 * @return
	 */
	public int findCount(T entity);

	/**
	 * 
	 * @param offset
	 * @param pageSize
	 * @return
	 */
	public List<T> findPage(@Param("offset") Integer offset, @Param("t") T t, @Param("pageSize") Integer pageSize);

}
