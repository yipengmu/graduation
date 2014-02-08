package com.greatwqs.action.accout;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.greatwqs.dao.DBconnector;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String uid;
	private String upassword;
	private Connection conn;
	
	
	public String getUid() {
		return uid;
	}


	public void setUid(String uid) {
		this.uid = uid;
	}


	public String getUpassword() {
		return upassword;
	}


	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}


	@Override
	public String execute() throws Exception {
		if(checkArgsEmpty()){
			return ERROR;
		}
		
		return checkUserLogIn();
	}


	private String checkUserLogIn() {
		conn = DBconnector.getconnector();
		String checkResult = SUCCESS;
		try {
			Statement st = conn.createStatement();
			
			ResultSet rs  = st.executeQuery("select * from account where Uid='" + getUid() + "' And UPassword='" + getUpassword() +"';");
			
			if(!rs.next()){
				checkResult = ERROR;
			}else{
				ActionContext context=ActionContext.getContext();
				//往request里放attribute
				context.put("uid",uid);
				//往session里放
				context.getSession().put("uid",uid);
				
				System.out.println("log: login success by user: " + rs.getString(2));
				checkResult = SUCCESS;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			checkResult = ERROR;
		}
		
		return checkResult;
	}


	private boolean checkArgsEmpty() {
		if(getUid() == null || getUpassword() == null){
			return true;
		}
		return false;
	}
}
