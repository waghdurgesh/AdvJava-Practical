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

@WebServlet(value = "/display", loadOnStartup = -1)
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("****INIT****");
	}

	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("****DO GET****");

		String url = "https://api.github.com/users/waghdurgesh";
		DBConnect database = new DBConnect();
		String profile = database.getdata(url);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<p>profile: " + profile + "</p>");
		System.out.println(profile);
	}

}
