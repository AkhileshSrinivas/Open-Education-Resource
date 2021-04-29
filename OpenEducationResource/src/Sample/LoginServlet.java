package Sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("username");

		String password = request.getParameter("password");

		LoginBean loginBean = new LoginBean();

		loginBean.setUserName(userName);

		loginBean.setPassword(password);

		LoginDao loginDao = new LoginDao();

		try {
			String userValidate = loginDao.autheticateUser(loginBean);
			if (userValidate.equals("Lecturer_Role")) {

				HttpSession session = request.getSession(); // Creating a session
				session.setAttribute("Lecturer", userName); // setting session attribute
				request.setAttribute("userName", userName);
                                session.setAttribute("User", userName);
				
				request.getRequestDispatcher("Lecturer.jsp").forward(request, response);
			} else if (userValidate.equals("User_Role")) {

				HttpSession session = request.getSession();
				session.setAttribute("User", userName);
				request.setAttribute("userName", userName);

				request.getRequestDispatcher("User.jsp").forward(request, response);
			}
                        else if (userValidate.equals("Editor")) {

				HttpSession session = request.getSession();
				session.setAttribute("User", userName);
				request.setAttribute("userName", userName);

				request.getRequestDispatcher("editor.jsp").forward(request, response);
			}

			else {
				System.out.println("Error message = " + userValidate);
				request.setAttribute("errMessage", userValidate);

				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
