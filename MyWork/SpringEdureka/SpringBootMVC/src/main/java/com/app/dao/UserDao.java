package com.app.dao;

import com.app.pojo.User;

public interface UserDao {
	User authenticateUser(String email, String pwd);
}
