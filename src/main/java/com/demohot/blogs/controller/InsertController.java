package com.demohot.blogs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demohot.blogs.dao.StusDao;
import com.demohot.blogs.po.Stus;

public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String math = req.getParameter("math");
		String english = req.getParameter("english");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StusDao stusDao = context.getBean(StusDao.class, "stusDaoImpl");
		Stus stus = new Stus();
		stus.setName(name);
		stus.setMath(math);
		stus.setEnglish(english);
		stusDao.insert(stus);
		resp.getOutputStream().write("插入成功".getBytes());

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
