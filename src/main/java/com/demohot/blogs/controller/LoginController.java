package com.demohot.blogs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demohot.blogs.dao.UserDao;
import com.demohot.blogs.po.User;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = context.getBean(UserDao.class, "userDaoImpl");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userDao.insert(user);
		resp.getOutputStream().write("login success!!".getBytes());

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
