<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

 <script type="text/javascript" src="JS/jquery-1.4.2.min.js"></script>
<script src="JS/autocomplete-0.3.0.min.js"></script>

</head>
<body>
<%
	System.out.println("::::::::::::::::::::::::::::::::::");
    Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningframework", "root", "rootqwer");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("Select * from keywords");
	
	List li = new ArrayList();
	
	while(rs.next())
	{
		li.add(rs.getString(1));
	}
	
	String []str = new String[li.size()];
	
	Iterator it = li.iterator();
	
	int i=0;
	
	while(it.hasNext())
	{
		String p = (String)it.next();
		str[i] = p;
		i++;
	}
	
	String query = (String)request.getParameter("search");
	
	for(int j=0; j<str.length; j++)
	{
		if(str[j].toUpperCase().startsWith(query.toUpperCase()))
		{
			 out.print(str[j]+"\n");
		}
	}
	
    
    %>
</body>
</html>