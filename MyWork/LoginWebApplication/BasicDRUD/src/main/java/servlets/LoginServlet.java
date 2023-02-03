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

@WebServlet(value = "/LoginServlet", loadOnStartup = -1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao uss;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public void init(ServletConfig config) throws ServletException {
//		System.out.println("*******In Init LoginServlet*******");
//		try {
//			DBUtils.openConnection();
//			System.out.println("Connected to DB !.....");
//			uss = new UserDao();
//			System.out.println("Connected to DB !.....");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public void destroy() {
		System.out.println("*******In Destroy LoginServlet*******");
		// TODO Auto-generated method stub
	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html");
//		System.out.println("*******In GET LoginServlet*******");
//		PrintWriter pw = response.getWriter();
//		pw.write("<h1>Welcome to Login Page@ " + LocalDateTime.now() + "</h1>");
//	}
	
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		response.setContentType("text/html");
//		System.out.println("*******In GET LoginServlet*******");
//		/* pw.write("<h1>Welcome to Login Page@ " + LocalDateTime.now() + "</h1>"); */
//		try (PrintWriter pw = response.getWriter();){
//			System.out.println("*******In GET Try LoginServlet*******");
//			String id="rama@gmail.com";
//			String ps = "1234";
//			UserPojo user= us.authenticateUser(id,ps);
//			System.out.println("authenticate method");
//			System.out.println(user);
//			pw.write(user.getUser_id());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("*******In Init LoginServlet*******");
		try {
			DBUtils.openConnection();
			System.out.println("Connected to DB !.....");
			uss = new UserDao();
			System.out.println("Connected to DB !.....");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("*******In GET LoginServlet*******");
		
		try (PrintWriter pw = response.getWriter();){
			pw.write("<h1>Welcome to Login Page@ " + LocalDateTime.now() + "</h1>");
			System.out.println("*******In GET Try LoginServlet*******");
			UserPojo user= uss.getAllUsers();
			System.out.println("getall method");
			System.out.println(user);
			pw.write(user.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("*******In POST LoginServlet*******");
		doGet(request, response);
	}

}
