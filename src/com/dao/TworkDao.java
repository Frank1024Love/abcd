package com.dao;

import java.util.List;


import com.pojo.Twork;

public class TworkDao {

	public int savework(String name,String intro,String url,String uid) {
		String sql="insert into twork(name,uname,intro,url,uid) values(?,?,?,?,?)";
		return DH.update(sql, new String[] {name,intro,url,uid});
	}
	
	public List getbyuid(String uid) {
		String sql="select * from twork where uid=?";
		return DH.getall(sql, new Twork(), new String[] {uid});
	}
	public List getAll(){
		String sql="select * from twork and order by score desc";
		return DH.getall(sql, new Twork(),null);
	}
	
	public Twork getone(String uid) {
		String sql="SELECT * from twork where uid=? and ischeck=0 ORDER BY id DESC LIMIT 1";
		List l=DH.getall(sql, new Twork(), new String[] {uid});
		return (Twork) l.get(0);
	}
	
	public int delWork(String id) {
		String sql="delete from twork where id=?";
		return DH.update(sql, new String[] {id});
	}
	
}
