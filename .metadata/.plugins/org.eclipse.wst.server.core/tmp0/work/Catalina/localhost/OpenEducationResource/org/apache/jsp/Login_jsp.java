/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2021-04-27 11:43:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<title>Login Form</title>\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("/* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */\r\n");
      out.write("@import url(https://fonts.googleapis.com/css?family=Open+Sans);\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\t*display: inline;\r\n");
      out.write("\t*zoom: 1;\r\n");
      out.write("\tpadding: 4px 10px 4px;\r\n");
      out.write("\tmargin-bottom: 0;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("\tline-height: 18px;\r\n");
      out.write("\tcolor: #333333;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\ttext-shadow: 0 1px 1px rgba(255, 255, 255, 0.75);\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\tbackground-color: #f5f5f5;\r\n");
      out.write("\tbackground-image: -moz-linear-gradient(top, #ffffff, #e6e6e6);\r\n");
      out.write("\tbackground-image: -ms-linear-gradient(top, #ffffff, #e6e6e6);\r\n");
      out.write("\tbackground-image: -webkit-gradient(linear, 0 0, 0 100%, from(#ffffff),\r\n");
      out.write("\t\tto(#e6e6e6));\r\n");
      out.write("\tbackground-image: -webkit-linear-gradient(top, #ffffff, #e6e6e6);\r\n");
      out.write("\tbackground-image: -o-linear-gradient(top, #ffffff, #e6e6e6);\r\n");
      out.write("\tbackground-image: linear-gradient(top, #ffffff, #e6e6e6);\r\n");
      out.write("\tbackground-repeat: repeat-x;\r\n");
      out.write("\tfilter: progid:dximagetransform.microsoft.gradient(startColorstr=#ffffff,\r\n");
      out.write("\t\tendColorstr=#e6e6e6, GradientType=0);\r\n");
      out.write("\tborder-color: #e6e6e6 #e6e6e6 #e6e6e6;\r\n");
      out.write("\tborder-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);\r\n");
      out.write("\tborder: 1px solid #e6e6e6;\r\n");
      out.write("\t-webkit-border-radius: 4px;\r\n");
      out.write("\t-moz-border-radius: 4px;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\t-webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px\r\n");
      out.write("\t\trgba(0, 0, 0, 0.05);\r\n");
      out.write("\t-moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px\r\n");
      out.write("\t\trgba(0, 0, 0, 0.05);\r\n");
      out.write("\tbox-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px\r\n");
      out.write("\t\trgba(0, 0, 0, 0.05);\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\t*margin-left: .3em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:hover, .btn:active, .btn.active, .btn.disabled, .btn[disabled] {\r\n");
      out.write("\tbackground-color: #e6e6e6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-large {\r\n");
      out.write("\tpadding: 9px 14px;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\tline-height: normal;\r\n");
      out.write("\t-webkit-border-radius: 5px;\r\n");
      out.write("\t-moz-border-radius: 5px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:hover {\r\n");
      out.write("\tcolor: #333333;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tbackground-color: #e6e6e6;\r\n");
      out.write("\tbackground-position: 0 -15px;\r\n");
      out.write("\t-webkit-transition: background-position 0.1s linear;\r\n");
      out.write("\t-moz-transition: background-position 0.1s linear;\r\n");
      out.write("\t-ms-transition: background-position 0.1s linear;\r\n");
      out.write("\t-o-transition: background-position 0.1s linear;\r\n");
      out.write("\ttransition: background-position 0.1s linear;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-primary, .btn-primary:hover {\r\n");
      out.write("\ttext-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-primary.active {\r\n");
      out.write("\tcolor: rgba(255, 255, 255, 0.75);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-primary {\r\n");
      out.write("\tbackground-color: #4a77d4;\r\n");
      out.write("\tbackground-image: -moz-linear-gradient(top, #6eb6de, #4a77d4);\r\n");
      out.write("\tbackground-image: -ms-linear-gradient(top, #6eb6de, #4a77d4);\r\n");
      out.write("\tbackground-image: -webkit-gradient(linear, 0 0, 0 100%, from(#6eb6de),\r\n");
      out.write("\t\tto(#4a77d4));\r\n");
      out.write("\tbackground-image: -webkit-linear-gradient(top, #6eb6de, #4a77d4);\r\n");
      out.write("\tbackground-image: -o-linear-gradient(top, #6eb6de, #4a77d4);\r\n");
      out.write("\tbackground-image: linear-gradient(top, #6eb6de, #4a77d4);\r\n");
      out.write("\tbackground-repeat: repeat-x;\r\n");
      out.write("\tfilter: progid:dximagetransform.microsoft.gradient(startColorstr=#6eb6de,\r\n");
      out.write("\t\tendColorstr=#4a77d4, GradientType=0);\r\n");
      out.write("\tborder: 1px solid #3762bc;\r\n");
      out.write("\ttext-shadow: 1px 1px 1px rgba(0, 0, 0, 0.4);\r\n");
      out.write("\tbox-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px\r\n");
      out.write("\t\trgba(0, 0, 0, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-primary:hover, .btn-primary:active, .btn-primary.active,\r\n");
      out.write("\t.btn-primary.disabled, .btn-primary[disabled] {\r\n");
      out.write("\tfilter: none;\r\n");
      out.write("\tbackground-color: #4a77d4;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-block {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-moz-box-sizing: border-box;\r\n");
      out.write("\t-ms-box-sizing: border-box;\r\n");
      out.write("\t-o-box-sizing: border-box;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tbackground-image: url(\"assets/images/homebg.jpg\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 50%;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tmargin: -150px 0 0 -150px;\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login h1 {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\ttext-shadow: 0 0 10px rgba(0, 0, 0, 0.3);\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("\tbackground: rgba(0, 0, 0, 0.3);\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\ttext-shadow: 1px 1px 1px rgba(0, 0, 0, 0.3);\r\n");
      out.write("\tborder: 1px solid rgba(0, 0, 0, 0.3);\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tbox-shadow: inset 0 -5px 45px rgba(100, 100, 100, 0.2), 0 1px 1px\r\n");
      out.write("\t\trgba(255, 255, 255, 0.2);\r\n");
      out.write("\t-webkit-transition: box-shadow .5s ease;\r\n");
      out.write("\t-moz-transition: box-shadow .5s ease;\r\n");
      out.write("\t-o-transition: box-shadow .5s ease;\r\n");
      out.write("\t-ms-transition: box-shadow .5s ease;\r\n");
      out.write("\ttransition: box-shadow .5s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input:focus {\r\n");
      out.write("\tbox-shadow: inset 0 -5px 45px rgba(100, 100, 100, 0.4), 0 1px 1px\r\n");
      out.write("\t\trgba(255, 255, 255, 0.2);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\tfunction doSubmit() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar test = ");
      out.print(request.getAttribute("errMessage"));
      out.write(";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(test!=null)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"error\").style.visibility = \"visible\"\r\n");
      out.write("\t\t\t      document.getElementById(\"error\").innerHTML = request.getAttribute(\"errMessage\");\r\n");
      out.write("\t\t\t     \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t document.getElementById(\"error\").style.visibility = \"hidden\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--Home page style-->\r\n");
      out.write("\t<header id=\"home\" class=\"home\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2 style=\"color:blue\">Login</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<form name=\"form\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/LoginServlet\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" placeholder=\"Username\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\trequired=\"required\" /> <input type=\"password\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"Password\" required=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" onclick=\"doSubmit()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-block btn-large\">Submit</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label type=\"hidden\" style=\"color:red\" id=\"error\"></label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/index.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
