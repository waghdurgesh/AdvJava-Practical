package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utils.DBConnect;

@WebServlet("profile")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url = "https://api.github.com/users/waghdurgesh";
		DBConnect database = new DBConnect();
		String profile= database.getdata(url);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<h3>profile: "+profile+"</h3>");
		System.out.println(profile);
	}

	
}
