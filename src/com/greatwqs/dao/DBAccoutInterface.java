package com.greatwqs.dao;

import com.greatwqs.bean.AccoutBean;

public interface DBAccoutInterface {

	public String checkLogin();
	public boolean addNewAccout(AccoutBean accoutBean);
}
