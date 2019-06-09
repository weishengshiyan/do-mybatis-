package com.ls.mybatis.Dao;

import java.util.List;

import com.ls.mybatis.pojo.User;

public interface UserDao {
	//默认public 例如
//	 User getUserById(Integer id);
//	 User getUserByUserName(String username);
//	 void insertUser(User user);
	//前面写的是返回值，后面写的入参
	public User getUserById(Integer id);
	public List<User> getUserByUserName(String username);
	public void insertUser(User user);

}
