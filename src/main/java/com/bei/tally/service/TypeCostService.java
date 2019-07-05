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

import com.bei.tally.dao.TypeCostMapper;
import com.bei.tally.entity.TypeCost;

/**
 * @ClassName: ProductService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年7月1日 下午2:32:56
 * 
 */
@Service
@Transactional(readOnly = true)
public class TypeCostService implements BaseService<TypeCost> {

	@Autowired
	private TypeCostMapper typeCostMapper;

	public TypeCost get(Integer id) {
		return typeCostMapper.selectByPrimaryKey(id);
	}

	public List<TypeCost> findList(TypeCost entity) {
		return typeCostMapper.findList(entity);
	}

	@Transactional(readOnly = false)
	public int save(TypeCost entity) {
		if (null != entity.getId()) {
			return typeCostMapper.updateByPrimaryKey(entity);
		} else {
			return typeCostMapper.insert(entity);
		}

	}

	@Transactional(readOnly = false)
	public int delete(Integer id) {
		return typeCostMapper.deleteByPrimaryKey(id);
	}

	public int findCount(TypeCost entity) {
		return 0;
	}

	public List<TypeCost> findPage(Integer offset, TypeCost t, Integer pageSize) {
		return null;
	}

}
