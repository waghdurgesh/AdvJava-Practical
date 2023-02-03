package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDao;
import com.app.pojo.User;

@Service // to tell class contains bus. logic
@Transactional //to tell sc : to use tx manager bean to auto handle transaction
public class UserServiceImpl implements UserService {
	// dependency : dao layer i/f
	@Autowired
	private UserDao userDao;

	@Override
	public User validateUser(String email, String password) {
		return userDao.authenticateUser(email, password);
	}// transaction method returns --> Transaction manager checks for un checked(Runtime exc) exc --
		// yes ---L1 cache destroyed and pooled out database connection returns to the pool
		// no -- auto dirty checking -> session.flush --> DMLs if needed ---L1 cache
		// destroyed n pooled out database connection returns to the pool
	//in case of successful login service layer returns --> detached user obj --> to the caller

}
