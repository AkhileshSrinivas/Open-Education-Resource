package Sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("uname");

		String password = request.getParameter("password");

		String role = request.getParameter("role");

		String address = request.getParameter("personaladdress");

		String sex = request.getParameter("sex");

		String emailid = request.getParameter("user_email");

		String dob = request.getParameter("dob");

		String bio = request.getParameter("user_bio");

		String interests = request.getParameter("user_interest");
		
		Connection con=null;
		
		PreparedStatement ps = null;

		try {
			
			con = DBConnection.getConnection();

			ps = con.prepareStatement("insert into users values(?,?,?,?,?,?,?,?,?)");

			ps.setString(1, name);
			ps.setString(2, password);

			ps.setString(3, role);
			ps.setString(4, address);
			ps.setString(5, sex);

			ps.setString(6, emailid);

			ps.setString(7, dob);

			ps.setString(8, bio);

			ps.setString(9, interests);
		
			int i = ps.executeUpdate();
			if (i > 0)
			{
				out.print("You are successfully registered...");
		    	out.print("<form action='Login.jsp'>");
		    	out.print("<input type='submit' value='Login'/>");
		    	out.print("</form>");
			}

			con.close();
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
		out.close();
	}

}
