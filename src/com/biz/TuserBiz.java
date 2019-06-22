package com.biz;

import java.util.List;

import com.dao.TmenuDao;
import com.dao.TuserDao;
import com.pojo.Tmenu;
import com.pojo.Tuser;

public class TuserBiz {
	
	public String login(String uname,String upwd){
		TuserDao td = new TuserDao();
		String s = "";
		Tuser u1=new Tuser();
		u1.setUname(uname);
		DL d = DL.getdl();
		Boolean b = d.checkuser(u1);
		if (b) {
			s="{\"msg\":\"input\"}";
		} else {
			Tuser u = td.login(uname, upwd);
			if(u==null){
				s="{\"msg\":\"error\"}";
			}else{
			d.saveuser(u);
			s=u.toString();//json格式: "":"" 属性之间逗号隔开。
		}
		}
		return s;
		
	}
	public String register(String uname,String upwd,String phoneNumber){
		TuserDao td = new TuserDao();
		
		String s = "";
		
		td.addUser(uname, upwd, phoneNumber);
		if(td.getUser(uname)==null){
			s="{\"msg\":\"error\"}";
		}else{
			s="{\"msg\":\"success\"}";
		}
		return s;
	}
	}
	

