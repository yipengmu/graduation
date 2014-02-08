package com.greatwqs.dao;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

public class DBUtils {
	public static boolean HasTable(String name) {
		// 判断某一个表是否存在
		boolean result = false;
		try {
			DatabaseMetaData meta = DBconnector.getconnector().getMetaData();
			ResultSet set = meta.getTables(null, null, name, null);
			while (set.next()) {
				result = true;
			}
		} catch (Exception eHasTable) {
			System.err.println(eHasTable);
			eHasTable.printStackTrace();
		}
		return result;
	}
}
