package com.biz;

import java.util.List;

import com.dao.TworkDao;

import com.pojo.Twork;

public class TworkBiz {

	private TworkDao td=new TworkDao();
	
	public String saveWork(String name,String intro,String url,String uid) {
		int num=td.savework(name, intro, url,uid);
		if (num>0) {
			return "{\"msg\":\"success\"}";
		}else {
			return "{\"msg\":\"error\"}";
		}
	}
	
	public String getone(String uid) {
		Twork j1=td.getone(uid);
		return j1.toString();
	}
	
	public String getAll(){
		List j3 = td.getAll();
		String s="[";
		for(int i=0;i<j3.size();i++){
			Twork work =(Twork)j3.get(i);
			//work.getUid();
			s+="{\"name\":\""+work.getName()+"\",\"intro\":\""+work.getIntro()+"\",\"URL\":\""+work.getUrl()+"\",\"score\":\""+work.getScore()+"\",\"ischeck\":\""+work.getIscheck()+"\"}";
		}
		s+="]";
		
		return s;
	}
	public String delWork(String uid){
		int j2=td.delWork(uid);
		if (j2>0) {
			return "{\"msg\":\"success\"}";
		} else {
			return "{\"msg\":\"error\"}";
		}
		
	}
	
}
