package com.echo;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;



@ServerEndpoint("/aaa")
public class Aecho {
	
	@OnOpen
	public void abcde(javax.websocket.Session session) {
		System.out.println("连接成功");
		try {
			session.getBasicRemote().sendText("你好，欢迎你");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@OnMessage
	public void abcde1(javax.websocket.Session session,String msg) {
		System.out.println(msg);
	}

}
