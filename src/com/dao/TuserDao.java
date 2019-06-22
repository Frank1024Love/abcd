package com.dao;

import java.util.List;

import com.pojo.Tuser;

public class TuserDao {
	public Tuser login(String uname,String upwd){
		String sql="SELECT * FROM tuser WHERE uname=? and upwd=?";
		List l = DH.getall(sql, new Tuser(), new String[]{uname,upwd});
		if(l.size()==0){
			return null;
		}
		return (Tuser)l.get(0);
	}
	public int addUser(String uname,String upwd,String phoneNumber){
		String sql="insert into tuser(uname,upwd,uphone) values(?,?,?)";		
		return DH.update(sql, new String[] {uname,upwd,phoneNumber});
	}
	public int updateUser(String id,String upwd,String phoneNumber) {
		String sql="update tuser set upwd=?,phoneNumber=? where uid=?";
		return DH.update(sql, new String[] {upwd,phoneNumber,id});
	}
	public Tuser getUser(String uname){
		String sql="select * from tuser where uname=?";
		List l= DH.getall(sql, new Tuser(), new String[]{uname});
		if(l.size()==0){
			return null;
		}
		return (Tuser)l.get(0);
	}

}
