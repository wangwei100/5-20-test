package com.demohot.blogs.dao.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demohot.blogs.dao.StusDao;
import com.demohot.blogs.po.Stus;

public class StusDaoImplTest {
	@Test
	public void testInsert() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StusDao stusDao = context.getBean(StusDao.class, "stusDaoImpl");
		Stus stus = new Stus();
		stus.setName("jim");
		stus.setMath("80");
		stus.setEnglish("87");
		stusDao.insert(stus);
	}
}
