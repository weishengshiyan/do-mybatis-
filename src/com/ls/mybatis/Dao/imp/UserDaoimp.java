package com.ls.mybatis.Dao.imp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ls.mybatis.Dao.UserDao;
import com.ls.mybatis.pojo.User;

public class UserDaoimp extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User getUserById(Integer id) {
		SqlSession sqlSession = super.getSqlSession();
		User user=sqlSession.selectOne("user.getUserById", 1);
		return user;
	}

	@Override
	public List<User> getUserByUserName(String username) {
		SqlSession sqlSession = super.getSqlSession();
		List<User> selectList = sqlSession.selectList("user.getUserByUserName", "уе");
		return selectList;
	}

	@Override
	public void insertUser(User user) {
		SqlSession sqlSession = super.getSqlSession();
		sqlSession.insert("user.insertUser",user);

	}

}
