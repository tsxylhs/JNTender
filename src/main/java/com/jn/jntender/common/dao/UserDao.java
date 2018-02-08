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
 * @����: UserDao
 * @����:
 * @����: lhs
 * @���� 2018��2��8�� ����10:09:32
 * @�޸���:
 * @�޸�ʱ��:
 */
@Repository
public class UserDao {


	@Autowired
	protected MongoTemplate mongoTemplate;
/**
 * 
 * @������: saveTest
 * @����:
 * @����:lhs
 * @param user
 * @���� 2018��2��8�� ����10:09:23
 * @����ֵ: void
 * @�޸���:
 * @�޸�ʱ��:
 */
	public void saveTest(User user) {
		mongoTemplate.save(user);
	}
	/**
	 * 
	 * @������: find
	 * @����:
	 * @����:lhs
	 * @���� 2018��2��8�� ����10:09:48
	 * @����ֵ: void
	 * @�޸���:
	 * @�޸�ʱ��:
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
	 * @������: findfilter
	 * @����: ������ѯ
	 * @����:lhs
	 * @���� 2018��2��8�� ����10:56:24
	 * @����ֵ: void
	 * @�޸���:
	 * @�޸�ʱ��:
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
      * @������: getPage
      * @����: ��ҳ
      * @����:lhs
      * @param begin
      * @param end
      * @���� 2018��2��8�� ����11:04:29
      * @����ֵ: void
      * @�޸���:
      * @�޸�ʱ��:
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
