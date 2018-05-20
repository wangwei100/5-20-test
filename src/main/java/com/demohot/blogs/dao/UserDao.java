package com.demohot.blogs.dao;

import com.demohot.blogs.po.User;

public interface UserDao {
	
	public boolean check(User user);
	
	void insert(User user);

	void select();

	boolean login(String username, String password);
}
