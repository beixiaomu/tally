/** 
 * @Title: ProductService.java 
 * @Package com.bei.tally.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年7月1日 下午2:32:56 
 * @version V1.0 
 */
package com.bei.tally.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bei.tally.dao.StoreMapper;
import com.bei.tally.entity.Analyse;
import com.bei.tally.entity.Store;

/**
 * @ClassName: ProductService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年7月1日 下午2:32:56
 * 
 */
@Service
@Transactional(readOnly = true)
public class StoreService implements BaseService<Store> {

	@Autowired
	private StoreMapper storeMapper;

	public Store get(Integer id) {
		return storeMapper.selectByPrimaryKey(id);
	}

	public List<Store> findList(Store entity) {
		return storeMapper.findList(entity);
	}

	@Transactional(readOnly = false)
	public int save(Store entity) {
		if (null != entity.getId()) {
			return storeMapper.updateByPrimaryKey(entity);
		} else {
			return storeMapper.insert(entity);
		}

	}

	@Transactional(readOnly = false)
	public int delete(Integer id) {
		return storeMapper.deleteByPrimaryKey(id);
	}

	public int findCount(Store entity) {
		return 0;
	}

	public List<Store> findPage(Integer offset, Store t, Integer pageSize) {
		return null;
	}

	public Analyse findAnalyseOne(Integer id) {
		System.out.println("******:"+id);
		return storeMapper.findAnalyseOne(id);
	}

	public List<Analyse> findAnalyse(Integer id) {
		return storeMapper.findAnalyse(id);
	}

	public Analyse findCount(Integer id) {
		return storeMapper.findCount(id);
	}

}
