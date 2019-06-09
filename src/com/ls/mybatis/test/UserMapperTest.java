package com.ls.mybatis.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ls.mybatis.mapper.UserMapper;
import com.ls.mybatis.pojo.User;

public class UserMapperTest {
	
private ApplicationContext applicationContext;
	
	@Before
	public void Init() {
		applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		
	}
	

	@Test
	public void testGetUserById() {
		UserMapper usermapper = applicationContext.getBean(UserMapper.class);
					User user = usermapper.getUserById(1);
					System.out.print(user);
		
	}

	@Test
	public void testGetUserByUserName() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertUser() {
		fail("Not yet implemented");
	}

}
