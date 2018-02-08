package com.jn.jntender.common.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.jn.jntender.common.entity.User;

@Repository
public class UserDao {

	@Autowired
	protected MongoTemplate mongoTemplate;

	public void saveTest(User user) {
		mongoTemplate.save(user);
	}
	public void find(){
		List<User>  userlist=new ArrayList<User>();
		 userlist=mongoTemplate.findAll(User.class);
		 for (User user : userlist) {
		     System.out.println(user.getId());
		}
		
	}
     public void findfilter(){
		
		List<User> userlist=new ArrayList<User>();
		Query query=new Query();
	     query.addCriteria(Criteria.where("name").is("lhs"));
		userlist=mongoTemplate.find(query, User.class);
		 for (User user : userlist) {
		     System.out.println(user.getId());
		}
	}
    /* public void */
}
