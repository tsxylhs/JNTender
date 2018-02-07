package com.jn.jntender.modules.tender.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jn.jntender.common.entity.User;
import com.jn.jntender.common.service.BaseService;

/**
 * 
 * @类名: TenderController
 * @描述: 系统业务的主控制器
 * @作者 Administrator
 * @日期 2018年2月4日 下午3:57:27
 * 
 * @修改人:
 * @修改时间:
 */
@Controller(value="/")
public class TenderController {
	
	/**
	 * 
	 * @方法名: tenderIndex
	 * @描述:
	 * @作者:hezw
	 * @return
	 * @日期 2018年2月4日 下午7:57:10
	 * @返回值: String
	 * @修改人:
	 * @修改时间:
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
