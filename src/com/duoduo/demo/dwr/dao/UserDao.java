package com.duoduo.demo.dwr.dao;

import com.duoduo.demo.dwr.model.User;

public class UserDao {

	public boolean isLogin(User user) {
		System.out.println("username=" + user.getUsername() + ", password=" + user.getPassword());
		return true;
	}
}
