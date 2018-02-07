package com.jn.jntender.modules.tender.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jn.jntender.common.entity.User;
import com.jn.jntender.common.service.BaseService;

/**
 * 
 * @����: TenderController
 * @����: ϵͳҵ�����������
 * @���� Administrator
 * @���� 2018��2��4�� ����3:57:27
 * 
 * @�޸���:
 * @�޸�ʱ��:
 */
@Controller(value="/")
public class TenderController {
	
	/**
	 * 
	 * @������: tenderIndex
	 * @����:
	 * @����:hezw
	 * @return
	 * @���� 2018��2��4�� ����7:57:10
	 * @����ֵ: String
	 * @�޸���:
	 * @�޸�ʱ��:
	 */
	@Autowired
	private BaseService  baseService;
	@RequestMapping(value="find")
	public void Mongofind(){
		baseService.findtest();
	}
	
	@RequestMapping(value="test")
	public void Mongotest(){
		User user = new User();
		user.setName("lhs");
		user.setAge(29);
		user.setBirth(new Timestamp(System.currentTimeMillis()));
		baseService.savetest(user);
	}
	
	
	@RequestMapping(value="")
	public String tenderIndex() {
		String viewString = "modules/tender/tenderIndex";
		return viewString;
	}
	
	@RequestMapping(value="seniorSearch")
	public String seniorSearch() {
		String viewString = "modules/tender/seniorSearch";
		return viewString;
	}

}
