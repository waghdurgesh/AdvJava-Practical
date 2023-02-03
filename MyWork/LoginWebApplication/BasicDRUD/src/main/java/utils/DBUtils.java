package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	private static Connection con;

	// add a static method to create single FIXED DB connection : will be called
	// exactly ONCE
	public static void openConnection() throws SQLException, ClassNotFoundException {
		System.out.println("In open conn");
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("driver loaded");
//		String URL = ;
		// get con from datamanager class
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningjava", "root", "123456789");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningjava", "root", "123456789");
		System.out.println("Connected to Database");
	}

	// getter for connection
	public static Connection getCon() {
		return con;
	}

	// close connection
	public static void closeConnection() throws SQLException {
		if (con != null)
			con.close();
	}

}
