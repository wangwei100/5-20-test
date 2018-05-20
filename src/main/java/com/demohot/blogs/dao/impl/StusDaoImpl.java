package com.demohot.blogs.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.demohot.blogs.dao.StusDao;
import com.demohot.blogs.po.Stus;

public class StusDaoImpl implements StusDao {
	public void insert(Stus stus) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/my_ku?serverTimezone=GMT",
					"root", null);
			Statement stmt = conn.createStatement();
			String sql = "insert into report card(name,math,english) values ('" + stus.getName() + "','"
					+ stus.getMath() + "','" + stus.getEnglish() + "')";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}