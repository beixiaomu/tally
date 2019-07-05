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

import com.bei.tally.dao.SourceMapper;
import com.bei.tally.entity.Source;

/**
 * @ClassName: ProductService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 技术部--徐周环 -.-
 * @date 2019年7月1日 下午2:32:56
 * 
 */
@Service
@Transactional(readOnly = true)
public class SourceService implements BaseService<Source> {

	@Autowired
	private SourceMapper sourceMapper;

	public Source get(Integer id) {
		return sourceMapper.selectByPrimaryKey(id);
	}

	public List<Source> findList(Source entity) {
		return sourceMapper.findList(entity);
	}

	@Transactional(readOnly = false)
	public int save(Source entity) {
		if (null != entity.getId()) {
			return sourceMapper.updateByPrimaryKey(entity);
		} else {
			return sourceMapper.insert(entity);
		}

	}

	@Transactional(readOnly = false)
	public int delete(Integer id) {
		return sourceMapper.deleteByPrimaryKey(id);
	}

	public int findCount(Source entity) {
		return 0;
	}

	public List<Source> findPage(Integer offset, Source t, Integer pageSize) {
		return null;
	}

}
