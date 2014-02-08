package com.greatwqs.action.accout;

import java.sql.Connection;
import java.sql.SQLException;

import com.greatwqs.bean.AccoutBean;
import com.greatwqs.dao.AccoutDao;
import com.greatwqs.dao.DBconnector;
import com.opensymphony.xwork2.ActionSupport;

public class SignInAction extends ActionSupport{

	private String sign_in_id;
	private String sign_in_password;
	private String sex;
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSign_in_id() {
		return sign_in_id;
	}

	public String getSign_in_password() {
		return sign_in_password;
	}


	public void setSign_in_id(String sign_in_id) {
		this.sign_in_id = sign_in_id;
	}


	public void setSign_in_password(String sign_in_password) {
		this.sign_in_password = sign_in_password;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("log: " + getSign_in_id() + " : " + getSign_in_password());
		if(checkArgsEmpty()){
			return ERROR;
		}
		
		if(!checkDBPrepared()){
			return ERROR;
		}
		
		createAccount();
		
		return SUCCESS;
	}


	/**  创建用户*/
	private void createAccount() {
		AccoutDao dao = new AccoutDao();
		AccoutBean bean = new AccoutBean(getSign_in_id(),getSign_in_password(),getSex());
		dao.addNewAccout(bean);
	}


	private boolean checkDBPrepared() {
		try {
			Connection con = DBconnector.getconnector();
			if(con == null || con.isClosed()){
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}	


	private boolean checkArgsEmpty() {
		if(getSign_in_id() == null || getSign_in_password() == null){
			return true;
		}
		return false;
	}
}
