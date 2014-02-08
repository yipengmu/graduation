package com.greatwqs.dao;
public class PersonDao {

	public String name = "admin" ;

	public String pasw = "1234";

	public boolean isPersonCanLogin(String username, String password) {
		return username.equals(password);
	}
	
	public PersonDao(String name, String pasw){
		this.name = name;
		this.pasw = pasw;
	}
	
	public PersonDao(){
	}
}
