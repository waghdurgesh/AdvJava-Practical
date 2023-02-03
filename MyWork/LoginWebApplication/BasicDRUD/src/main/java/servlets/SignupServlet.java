package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignUpServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SignupServlet() {   	
        super();
        System.out.println("*******In SignupServlet*******");
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("*******In Init SignupServlet*******");
		// TODO Auto-generated method stub
	}


	public void destroy() {
		System.out.println("*******In Destroy SignupServlet*******");
		// TODO Auto-generated method stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("*******In GET SignupServlet*******");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<h1>Welcome to Signup Page@ "+LocalDateTime.now()+"</h1>");
				
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("*******In POST SignupServlet*******");
		doGet(request, response);
	}

}
