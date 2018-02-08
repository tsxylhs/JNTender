package com.jn.jntender.common.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.jn.jntender.common.entity.User;
/**
 * 
 * @类名: UserDao
 * @描述:
 * @作者: lhs
 * @日期 2018年2月8日 下午10:09:32
 * @修改人:
 * @修改时间:
 */
@Repository
public class UserDao {


	@Autowired
	protected MongoTemplate mongoTemplate;
/**
 * 
 * @方法名: saveTest
 * @描述:
 * @作者:lhs
 * @param user
 * @日期 2018年2月8日 下午10:09:23
 * @返回值: void
 * @修改人:
 * @修改时间:
 */
	public void saveTest(User user) {
		mongoTemplate.save(user);
	}
	/**
	 * 
	 * @方法名: find
	 * @描述:
	 * @作者:lhs
	 * @日期 2018年2月8日 下午10:09:48
	 * @返回值: void
	 * @修改人:
	 * @修改时间:
	 */
	public void find(){
		List<User>  userlist=new ArrayList<User>();
		 userlist=mongoTemplate.findAll(User.class);
		 for (User user : userlist) {
		     System.out.println(user.getId());
		}
		
	}
	/**
	 * 
	 * @方法名: findfilter
	 * @描述: 条件查询
	 * @作者:lhs
	 * @日期 2018年2月8日 下午10:56:24
	 * @返回值: void
	 * @修改人:
	 * @修改时间:
	 */
     public void findfilter(){
		
		List<User> userlist=new ArrayList<User>();
		Query query=new Query();
	     query.addCriteria(Criteria.where("name").is("lhs"));
		userlist=mongoTemplate.find(query, User.class);
		 for (User user : userlist) {
		     System.out.println(user.getId());
		}
	}
     /**
      * 
      * @方法名: getPage
      * @描述: 分页
      * @作者:lhs
      * @param begin
      * @param end
      * @日期 2018年2月8日 下午11:04:29
      * @返回值: void
      * @修改人:
      * @修改时间:
      */
    public void getPage(int begin,int end){
    	
    	List <User>  userlist=new ArrayList<User>();
    	Query query=new Query();
    	String namevalue="lh";
    	query.addCriteria(Criteria.where("name").regex(".*?"+namevalue+".*"));
    	query.limit(end-begin).skip(begin);
    userlist=mongoTemplate.find(query, User.class);
    for (User user : userlist) {
	  System.out.println(user.toString());	
	}
    	
    } 
}
