package com.pojo;

import java.io.Serializable;

public class Twork implements Serializable {
	private int id;
	private int uid;
	private String name;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	private  String intro;
	private String url;
	private int score;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getIscheck() {
		return ischeck;
	}
	public void setIscheck(int ischeck) {
		this.ischeck = ischeck;
	}
	private int ischeck;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="{\"id\":\""+this.id+"\",\"workname\":\""+this.name+"\",\"intro\":\""+this.intro+"\",\"URL\":\""+this.url+"\",\"zt\":\""+this.ischeck+"\",\"score\":\""+this.score+"\"}";
		return s;
	}

}
