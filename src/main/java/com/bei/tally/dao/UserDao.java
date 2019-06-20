/** 
 * @Title: UserDao.java 
 * @Package com.zhwl.pos.dao 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author ������--���ܻ�   -.- 
 * @date 2019��5��8�� ����3:01:57 
 * @version V1.0 
 */ 
package com.bei.tally.dao;

import com.bei.tally.entity.User;

/** 
 * @ClassName: UserDao 
 * @Description: TODO(������һ�仰��������������) 
 * @author ������--���ܻ�   -.- 
 * @date 2019��5��8�� ����3:01:57 
 *  
 */
public interface  UserDao {
	public abstract User findByUsername(String username);
}
