/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2021-04-29 05:33:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Lecturer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	ResultSet resultset = null;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: url(\"assets/images/homebg.jpg\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"text\"], input[type=\"file\"], select {\r\n");
      out.write("\tbackground: rgba(255, 255, 255, 0.1);\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\toutline: 0;\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tbackground-color: #e8eeef;\r\n");
      out.write("\tcolor: #8a97a0;\r\n");
      out.write("\tbox-shadow: 0 1px 0 rgba(0, 0, 0, 0.03) inset;\r\n");
      out.write("\tmargin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("submit {\r\n");
      out.write("\tpadding: 19px 39px 18px 39px;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\tbackground-color: #4bc970;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-style: normal;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tborder: 1px solid #3ac162;\r\n");
      out.write("\tborder-width: 1px 1px 3px;\r\n");
      out.write("\tbox-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write(" ");

        String userID ="" ;
    if(session.getAttribute("User")!=null)
       {
        userID=session.getAttribute("User").toString();
       }
       else{
       userID="";
       } 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningframework", "root", "rootqwer");


			Statement statement = con.createStatement();

			resultset = statement.executeQuery("select * from keywords");
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("        \r\n");
      out.write("        <br/>\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"UploadServlet\" method=\"post\"\r\n");
      out.write("\t\tenctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("         <h3 style=\"color:blue\">Select File: Keywords:</h3>\r\n");
      out.write("\t\t <select multiple name=\"keywords\">\r\n");
      out.write("\t\t\t");

				while (resultset.next()) {
			
      out.write("\r\n");
      out.write("\t\t\t<option>");
      out.print(resultset.getString(1));
      out.write("</option>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!--  \t\tSelect File: Keywords: <select multiple name=\"keywords\">\r\n");
      out.write("\t\t\t<option value=\"cc\">CC</option>\r\n");
      out.write("\t\t\t<option value=\"fc\">FC</option>\r\n");
      out.write("\t\t\t<option value=\"cse\">CSE</option>\r\n");
      out.write("\t\t\t<option value=\"cs\">CS</option>\r\n");
      out.write("\t\t\t<option value=\"fc\">FC</option>\r\n");
      out.write("\t\t\t<option value=\"vm\">VM</option>\r\n");
      out.write("\t\t</select>  -->\r\n");
      out.write("         <h3 style=\"color:blue\">Others:</h3>\r\n");
      out.write("\t\t <input type=\"text\" name=\"otherKw\" /> <br /> \r\n");
      out.write("                  <input type=\"hidden\" name=\"email\" value=\"");
      out.print(userID);
      out.write("\" /> \r\n");
      out.write("                  \r\n");
      out.write("                  ");

                  System.out.println("*********** "+ userID +" *********************");
			
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                 \r\n");
      out.write("                \r\n");
      out.write("                 \r\n");
      out.write("                 <input type=\"file\" name=\"fname\" /> <input type=\"submit\" value=\"upload\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		//**Should I input the codes here?**
		} catch (Exception e) {
			out.println("wrong entry" + e);
		}
	
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
