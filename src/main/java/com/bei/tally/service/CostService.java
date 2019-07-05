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

import com.bei.tally.dao.CostMapper;
import com.bei.tally.entity.Cost;

/**
 * @ClassName: ProductService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年7月1日 下午2:32:56
 * 
 */
@Service
@Transactional(readOnly = true)
public class CostService implements BaseService<Cost> {

	@Autowired
	private CostMapper costMapper;

	public Cost get(Integer id) {
		return costMapper.selectByPrimaryKey(id);
	}

	public List<Cost> findList(Cost entity) {
		return costMapper.findList(entity);
	}

	@Transactional(readOnly = false)
	public int save(Cost entity) {
		if (null != entity.getId()) {
			return costMapper.updateByPrimaryKey(entity);
		} else {
			return costMapper.insert(entity);
		}

	}

	@Transactional(readOnly = false)
	public int delete(Integer id) {
		return costMapper.deleteByPrimaryKey(id);
	}

	public int findCount(Cost entity) {
		return 0;
	}

	public List<Cost> findPage(Integer offset, Cost t, Integer pageSize) {
		return null;
	}

}
