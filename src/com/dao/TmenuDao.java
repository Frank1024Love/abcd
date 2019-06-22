package com.dao;

import java.util.List;

import com.pojo.Tmenu;

public class TmenuDao {

	public List getbyuid(String uid,String pid) {
		String sql="select * FROM tmenu where pid=? and id in(select mid from trm WHERE rid in(select rid from tur where uid=?))";
		return DH.getall(sql, new Tmenu(), new String[] {pid,uid});
	}
	
}
