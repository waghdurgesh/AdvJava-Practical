package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import utils.DBUtils;

@WebServlet("/ConnTester")
public class ConnTester extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ConnTester() {
        super();
       
    }
    
    UserDao UserData;

	public void init(ServletConfig config) throws ServletException {
		
		try {
			DBUtils.openConnection();
			UserData = new UserDao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--inside Connect tester init---"+getClass());
		
		
	}
	public void destroy() {
		System.out.println("--inside Connect tester destroy---"+getClass());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
		response.setContentType("test/html");
		
		try(PrintWriter pw = response.getWriter()){
			pw.write("<h2>DB Tester Working here</h2>");
			System.out.println("DB Tester Working");
			
		}
		
	}

}
