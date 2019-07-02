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

import com.bei.tally.dao.ProduceMapper;
import com.bei.tally.entity.Produce;

/** 
 * @ClassName: ProductService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年7月1日 下午2:32:56 
 *  
 */
@Service
@Transactional(readOnly = true)
public class ProduceService implements BaseService<Produce> {

	@Autowired
	private ProduceMapper produceMapper;
	
	public Produce get(Integer id) {
		return produceMapper.selectByPrimaryKey(id);
	}

	public List<Produce> findList(Produce entity) {
		return produceMapper.findList(entity);
	}
	@Transactional(readOnly = false)
	public int save(Produce entity) {
		if(null!=entity.getId()) {
			return produceMapper.updateByPrimaryKey(entity);
		}else {
			return produceMapper.insert(entity);
		}
		
	}
	@Transactional(readOnly = false)
	public int delete(Integer id) {
		return produceMapper.deleteByPrimaryKey(id);
	}

	public int findCount(Produce entity) {
		return 0;
	}

	public List<Produce> findPage(Integer offset, Produce t, Integer pageSize) {
		return null;
	}
	

}
