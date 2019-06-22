package com.biz;

import java.util.Vector;

import com.pojo.Tuser;

public class DL {  //  单例模式
	private DL(){
		this.useronline = new Vector<Tuser>();
	}
	private static DL d;
	public synchronized static DL getdl(){  // 同步 
		if(d==null){
			d = new DL();
		}
		return d;
	}
	//  存储所有已经登录的账号信息。LIst 线程不安全。 使用vector 在这里
	private Vector<Tuser> useronline;
	
	public Boolean checkuser(Tuser u){
		Boolean b = false;
		for (Tuser tuser : useronline) {
			if(tuser.equals(u)){
			b = true;
			break;
			}
		}
//		for (int i = 0; i < useronline.size(); i++) {
//			Tuser u1 = useronline.get(i);
//			if(u1.equals(u)){
//				b= true;
//				break;
//			}
//		}
		return b;
	}
	public synchronized void saveuser(Tuser u){
		this.useronline.add(u);
	}
	
	
	
	

}
