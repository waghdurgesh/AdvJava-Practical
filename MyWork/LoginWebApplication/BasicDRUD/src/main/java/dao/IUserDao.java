package dao;

import java.sql.SQLException;

import bol.UserPojo;

public interface IUserDao {
	UserPojo authenticateUser(String email,String pwd) throws SQLException;
}
