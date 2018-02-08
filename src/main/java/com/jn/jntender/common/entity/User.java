package com.jn.jntender.common.entity;


import java.io.Serializable;  
import java.sql.Timestamp;  

import org.springframework.data.annotation.Id;  
import org.springframework.data.mongodb.core.index.IndexDirection;  
import org.springframework.data.mongodb.core.index.Indexed;  
import org.springframework.data.mongodb.core.mapping.Document;  
import org.springframework.data.mongodb.core.mapping.Field;  

/** 
* �û�ʵ���� 
* <p> 
* ClassName: UserInfo 
* </p> 
* <p> 
* Description:��������չʾMongoDBʵ����ӳ���ʹ�� 
* </p> 
* <p> 
* Copyright: (c)2017 Jastar��Wang,All rights reserved. 
* </p> 
*  
* @author Jastar��Wang 
* @date 2017��4��12�� 
*/  
@Document(collection = "coll_user1")  
public class User implements Serializable {  

  /** serialVersionUID */  
  private static final long serialVersionUID = 1L;  

  // ����ʹ�ô�ע��  
  @Id  
  private String id;  

  // �ֶ�ʹ�ô�ע��  
  @Field  
  private String name;  

  // �ֶλ��������Զ�������  
  @Field("myage")  
  private int age;  

  // ��������������  
  @Indexed(name = "index_birth", direction = IndexDirection.DESCENDING)  
  @Field  
  private Timestamp birth;  

  public String getId() {  
      return id;  
  }  

  public void setId(String id) {  
      this.id = id;  
  }  

  public String getName() {  
      return name;  
  }  

  public void setName(String name) {  
      this.name = name;  
  }  

  public int getAge() {  
      return age;  
  }  

  public void setAge(int age) {  
      this.age = age;  
  }  

  public Timestamp getBirth() {  
      return birth;  
  }  

  public void setBirth(Timestamp birth) {  
      this.birth = birth;  
  }

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", age=" + age + ", birth=" + birth + "]";
}  
  

}  
