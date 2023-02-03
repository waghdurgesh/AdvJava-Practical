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
		System.out.println("In UserDAO !......");
		dbConn = getCon();
//		pStatement = dbConn.prepareStatement("SELECT * FROM users WHERE email = ? AND password = ?");
		pStatement=dbConn.prepareStatement("select * from users where email=? and password=?");
	}

	@Override
	public UserPojo authenticateUser(String user_email, String user_password) throws SQLException {

		// set INPUT
		System.out.println("Inside authenticateUser!!!!!!!!!!!!");
		pStatement.setString(1, user_email);
		pStatement.setString(2, user_password);
		// execute
		ResultSet dbResult = pStatement.executeQuery();
//		System.out.println(" "+dbResult.getInt("id")+" "+ dbResult.getString("name")+" "+dbResult.getString("email")+" "+dbResult.getString("password")+" "+
//				dbResult.getDouble("reg_amt")+" "+ dbResult.getDate("reg_date")+" "+dbResult.getString("role"));
		
			if (dbResult.next()) {
				System.out.println("In UserDAO !......");
				UserPojo us=  new UserPojo(dbResult.getInt("id"), dbResult.getString("name"),
						dbResult.getString("email"), dbResult.getString("password"),
						dbResult.getDouble("reg_amt"), dbResult.getDate("reg_date"),
						dbResult.getString("role"));
				System.out.println(us);
//				return new UserPojo(dbResult.getInt("user_id"), dbResult.getString("user_name"),
//						dbResult.getString("user_email"), dbResult.getString("user_password"),
//						dbResult.getDouble("user_reg_amt"), dbResult.getDate("user_reg_date"),
//						dbResult.getString("user_role"));
				return us;
			}
		
		return null;
	}

	public void cleanUp() throws SQLException {
		if (pStatement != null)
			pStatement.close();
		System.out.println("User DAO Cleaned !......");
	}
}
