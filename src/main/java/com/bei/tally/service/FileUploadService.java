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

import com.bei.tally.dao.FileUploadMapper;
import com.bei.tally.entity.FileUpload;

/** 
 * @ClassName: ProductService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 技术部--徐周环   -.- 
 * @date 2019年7月1日 下午2:32:56 
 *  
 */
@Service
@Transactional(readOnly = true)
public class FileUploadService implements BaseService<FileUpload> {

	@Autowired
	private FileUploadMapper fileUploadMapper;
	
	public FileUpload get(Integer id) {
		return fileUploadMapper.selectByPrimaryKey(id);
	}

	public List<FileUpload> findList(FileUpload entity) {
		return fileUploadMapper.findList(entity);
	}
	@Transactional(readOnly = false)
	public int save(FileUpload entity) {
		if(null!=entity.getId()) {
			return fileUploadMapper.updateByPrimaryKey(entity);
		}else {
			return fileUploadMapper.insert(entity);
		}
		
	}
	@Transactional(readOnly = false)
	public int delete(Integer id) {
		return fileUploadMapper.deleteByPrimaryKey(id);
	}

	public int findCount(FileUpload entity) {
		return 0;
	}

	public List<FileUpload> findPage(Integer offset, FileUpload t, Integer pageSize) {
		return null;
	}
	

}
