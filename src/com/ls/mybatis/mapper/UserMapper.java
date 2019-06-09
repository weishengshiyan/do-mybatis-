package com.ls.mybatis.mapper;

import java.util.List;

import com.ls.mybatis.pojo.User;
public interface UserMapper {
	public User getUserById(Integer id);
	public List<User> getUserByUserName(String username);
	public void insertUser(User user);

	
}
