package com.pojo;

import java.io.Serializable;
//  �����л�
public class Tuser implements Serializable {
       private int id;
       private String uname;
       private String upwd;
       public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	private String phoneNumber;
//       private int age;
	@Override  //ע��  ����Ҫ��
	public String toString() {
		String s="{\"id\":\""+this.id+"\",\"username\":\""+this.uname+"\"}";
	//String	s="{\"id\":\""+this.getId()+"\",\"realname\":\""+this.getRealname()+"\"}"; // this ����ǰ����
		// TODO Auto-generated method stub
		return s;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Tuser u1 = (Tuser)obj;
		if (u1.getUname().equals(this.uname)) {
			return true;
		}
		else{
			return false;
		}
	}
	
    
    
    
    
    
    
    
    
    
    
    
    
}
