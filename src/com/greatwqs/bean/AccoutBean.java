package com.greatwqs.bean;

public class AccoutBean {
	private String Uid;
	private String UPassword;
	private String Usex;
	
	public AccoutBean(String Uid,String UPassword,String Usex){
		this.Uid = Uid;
		this.UPassword = UPassword;
		this.Usex = Usex;
	}
	
	public String getId() {
		return Uid;
	}
	public void setId(String Uid) {
		this.Uid = Uid;
	}
	public String getPassword() {
		return UPassword;
	}
	public void setPassword(String UPassword) {
		this.UPassword = UPassword;
	}
	public String getSex() {
		return Usex;
	}
	public void setSex(String Usex) {
		this.Usex = Usex;
	}
	
}
