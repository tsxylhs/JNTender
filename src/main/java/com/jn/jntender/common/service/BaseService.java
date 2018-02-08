package com.jn.jntender.common.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jn.jntender.common.dao.UserDao;
import com.jn.jntender.common.entity.User;
/**
 * 
 * @类名: BaseService
 * @描述:
 * @作者: lhs
 * @日期 2018年2月8日 下午11:16:13
 * @修改人:
 * @修改时间:
 */
@Service
public  class BaseService {
	@Autowired
	private UserDao userdao;
	/**
	 * 
	 * @方法名: savetest
	 * @描述:
	 * @作者:lhs
	 * @param user
	 * @日期 2018年2月8日 下午11:06:53
	 * @返回值: void
	 * @修改人:
	 * @修改时间:
	 */
	public void savetest(User user){
		userdao.saveTest(user);
	}
	/**
	 * 
	 * @方法名: findtest
	 * @描述:
	 * @作者:lhs
	 * @日期 2018年2月8日 下午11:06:36
	 * @返回值: void
	 * @修改人:
	 * @修改时间:
	 */
	public void findtest(){
		userdao.find();
	}
/**
 * 
 * @方法名: findfilter
 * @描述:
 * @作者:lhs
 * @日期 2018年2月8日 下午11:04:55
 * @返回值: void
 * @修改人:
 * @修改时间:
 */
	public void findfilter() {
		userdao.findfilter();
		
	}
	public void getpage(){
	   userdao.getPage(2, 4);
	}
	

	
}
