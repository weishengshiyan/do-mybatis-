package com.ls.mybatis.Dao;

import java.util.List;

import com.ls.mybatis.pojo.User;

public interface UserDao {
	//Ĭ��public ����
//	 User getUserById(Integer id);
//	 User getUserByUserName(String username);
//	 void insertUser(User user);
	//ǰ��д���Ƿ���ֵ������д�����
	public User getUserById(Integer id);
	public List<User> getUserByUserName(String username);
	public void insertUser(User user);

}
