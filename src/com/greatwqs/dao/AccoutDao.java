package com.greatwqs.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.greatwqs.bean.AccoutBean;
import com.mysql.jdbc.StringUtils;

public class AccoutDao implements DBAccoutInterface {

	private Connection mConnection;

	@Override
	public String checkLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addNewAccout(AccoutBean accoutBean) {
		if (!checkAccoutBean(accoutBean)) {
			return false;
		}
		return insertDBAccoutBean(accoutBean);
	}

	public boolean insertDBAccoutBean(AccoutBean accoutBean) {
		mConnection = DBconnector.getconnector();
		boolean insertResult = true;
		try {
			if (mConnection != null && mConnection.isClosed()) {
				insertResult = false;
			}

			boolean dbPrepared = true;
			if (!DBUtils.HasTable("account")) {
				dbPrepared = createAccountTable();
			}

			if (dbPrepared) {
				// statement用来执行SQL语句
				Statement statement = mConnection.createStatement();
				// 要执行的SQL语句
				statement.executeUpdate("insert into account"+" values ('id_"+ System.currentTimeMillis()+"','"+ accoutBean.getId() +"','"+ accoutBean.getPassword()+"','20')");
//				String sql = "select * from accout";
//				// 结果集
//				ResultSet rs = statement.executeQuery(sql);
			}else{
				insertResult = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return insertResult;
	}

	private boolean createAccountTable() {
		try {
			Statement state = mConnection.createStatement();
			state.execute("create table account (ID varchar(100) primary key , Uid varchar(30), UPassword varchar(30), Sex varchar(10))");
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private boolean checkAccoutBean(AccoutBean accoutBean) {
		if(StringUtils.isNullOrEmpty(accoutBean.getId()) || StringUtils.isNullOrEmpty(accoutBean.getPassword())){
			return false;
		}
		return true;
	}
}
