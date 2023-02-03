package dao;

import static utils.DBUtils.getCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bol.UserPojo;

public class UserDao implements IUserDao {

	// connection
	private Connection dbConn;
	private PreparedStatement pStatement;
	private PreparedStatement stmt;
	ResultSet rset;

	public UserDao() throws SQLException {
		System.out.println("in userdao");
		dbConn = getCon();
		System.out.println("before statement");
		pStatement = dbConn.prepareStatement("SELECT * FROM users1 WHERE user_email = ? AND user_password = ?");
		System.out.println("topper durga");
		System.out.println("User DAO created..");
		stmt = dbConn.prepareStatement("select * from users1");
	}

	@Override
	public UserPojo authenticateUser(String user_email, String user_password) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("in auth");
		// set INPUT
		pStatement.setString(1, user_email);
		pStatement.setString(2, user_password);
		// execute
		try (ResultSet dbResult = pStatement.executeQuery()) {
			if (dbResult.next()) {
				System.out.println(dbResult);
				return new UserPojo(dbResult.getInt("user_id"), dbResult.getString("user_name"),
						dbResult.getString("user_email"), dbResult.getString("user_password"),
						dbResult.getDouble("user_reg_amt"), dbResult.getDate("user_reg_date"),
						dbResult.getString("user_role"));
			}
		}
		return null;
	}

	public UserPojo getAllUsers() throws SQLException {

		UserPojo allUser = new UserPojo();
		try (ResultSet rset = stmt.executeQuery();) {
			if (rset.next()) {
				System.out.println("in alluser");
			}
			return new UserPojo(rset.getInt("user_id"), rset.getString("user_name"), rset.getString("user_email"),
					rset.getString("user_password"), rset.getDouble("user_reg_amt"), rset.getDate("user_reg_date"),
					rset.getString("user_role"));
		}

	}

	public void cleanUp() throws SQLException {
		if (pStatement != null)
			pStatement.close();
		System.out.println("User DAO Cleaned !......");
	}
}
