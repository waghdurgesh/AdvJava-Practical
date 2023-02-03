package com.app.service;

import com.app.pojo.User;

public interface UserService {
	User validateUser(String email, String password);
}
