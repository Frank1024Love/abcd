package com.biz;

import java.util.List;

import com.dao.TmenuDao;
import com.pojo.Tmenu;

public class TmenuBiz {

	public String getbyuid(String uid) {
		TmenuDao m1=new TmenuDao();
		List l1=m1.getbyuid(uid, "0");
		String s="[";
		for (int i = 0; i < l1.size(); i++) {
			Tmenu me1=(Tmenu) l1.get(i);
			s+="{\"menutext\":\""+me1.getMenutext()+"\",\"submenus\":[";
			List l2=m1.getbyuid(uid, me1.getId()+"");
			for (int j = 0; j < l2.size(); j++) {
				s+=l2.get(j).toString()+",";
			}
			if (l2.size()>0) {
				s=s.substring(0, s.length()-1);
			}
			s+="]},";
		}
		if(l1.size()>0) {
			s=s.substring(0, s.length()-1);
		}
		
		s+="]";
		return s;
	}
	
}
