package com.biz;

import com.dao.TuserDao;
import com.pojo.Tuser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tuser t=new Tuser();
		TuserBiz tb = new TuserBiz();
	System.out.println(tb.login("lijian", "123456"));
	//System.out.println(tb.gMenu("1"));
	

	}

}
