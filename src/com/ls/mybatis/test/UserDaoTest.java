package com.ls.mybatis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.InitBinder;

import com.ls.mybatis.Dao.UserDao;
import com.ls.mybatis.pojo.User;

public class UserDaoTest {
	private ApplicationContext applicationContext;
	
	@Before
	public void Init() {
		applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		
	}
	

	@Test
	public void testGetUserById() {
		UserDao userdao = applicationContext.getBean(UserDao.class);
		User user=userdao.getUserById(1);
		System.out.println(user);
	}

	@Test
	public void testGetUserByUserName() {
		UserDao userDao = applicationContext.getBean(UserDao.class);
		List<User> userByUserName = userDao.getUserByUserName("’≈");
		for(User user:userByUserName) {
		System.out.println(user);
		}
		
	}

	@Test
	public void testInsertUser() {
		UserDao userdao = applicationContext.getBean(UserDao.class);
		User user = new User();	
		
		user.setUsername("≤‹≤Ÿ");
		userdao.insertUser(user);
		
		
	}			

}
