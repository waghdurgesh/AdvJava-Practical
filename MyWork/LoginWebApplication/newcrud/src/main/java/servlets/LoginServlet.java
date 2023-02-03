package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bol.UserPojo;
import dao.UserDao;
import utils.DBUtils;

@WebServlet(value = "/LoginServlet", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userObj;

	public LoginServlet() {
		super();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("*******In Init LoginServlet*******");
		try {
			DBUtils.openConnection();
			userObj = new UserDao();
			System.out.println("Connection Stat with DB !.....");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		System.out.println("*******In Destroy LoginServlet*******");
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("*******In POST LoginServlet*******");
		try (PrintWriter pw = response.getWriter();) {
			System.out.println("--Inside doPost---" + getClass());
			pw.write("<h1>Welcome to Login Page</h1>");

			// get parameter from login page
			String uname = request.getParameter("username");
			String pass = request.getParameter("password");
			System.out.println("Name= "+uname+"Password= "+pass);
			// authenticate
			UserPojo user = userObj.authenticateUser(uname, pass);
			if (user != null) {
				pw.write("<h3>Welcome to Learning Java</h3>");
				pw.write("<i><h4>Name: " + user.getUser_name() + "</h4></i>");
				pw.write("<i><h4>Email: " + user.getUser_email() + "</h4></i>");
				System.out.println("UserName:" + user.getUser_email() + " Password: " + user.getUser_password());
			} else {
				pw.write("<h3>Login Failed !!!</h3>");
				response.sendRedirect("Login.html");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("*******In POST LoginServlet*******");
		doGet(request, response);
	}

}
