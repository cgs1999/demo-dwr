package com.duoduo.demo.dwr.service;

import com.duoduo.demo.dwr.dao.UserDao;
import com.duoduo.demo.dwr.model.User;

public class UserService {

	private static UserDao userDao = new UserDao();

	public boolean isLogin(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return userDao.isLogin(user);
	}

	public boolean save(User user) {
		return false;
	}
}
