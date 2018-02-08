package com.jn.jntender.common.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jn.jntender.common.dao.UserDao;
import com.jn.jntender.common.entity.User;
/**
 * 
 * @����: BaseService
 * @����:
 * @����: lhs
 * @���� 2018��2��8�� ����11:16:13
 * @�޸���:
 * @�޸�ʱ��:
 */
@Service
public  class BaseService {
	@Autowired
	private UserDao userdao;
	/**
	 * 
	 * @������: savetest
	 * @����:
	 * @����:lhs
	 * @param user
	 * @���� 2018��2��8�� ����11:06:53
	 * @����ֵ: void
	 * @�޸���:
	 * @�޸�ʱ��:
	 */
	public void savetest(User user){
		userdao.saveTest(user);
	}
	/**
	 * 
	 * @������: findtest
	 * @����:
	 * @����:lhs
	 * @���� 2018��2��8�� ����11:06:36
	 * @����ֵ: void
	 * @�޸���:
	 * @�޸�ʱ��:
	 */
	public void findtest(){
		userdao.find();
	}
/**
 * 
 * @������: findfilter
 * @����:
 * @����:lhs
 * @���� 2018��2��8�� ����11:04:55
 * @����ֵ: void
 * @�޸���:
 * @�޸�ʱ��:
 */
	public void findfilter() {
		userdao.findfilter();
		
	}
	public void getpage(){
	   userdao.getPage(2, 4);
	}
	

	
}
