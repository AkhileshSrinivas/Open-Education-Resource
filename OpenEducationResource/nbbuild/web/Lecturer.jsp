<%@ page import="java.sql.*"%>
<%
	ResultSet resultset = null;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<style>


body {
	background-image: url("assets/images/homebg.jpg");
}

input[type="text"], input[type="file"], select {
	background: rgba(255, 255, 255, 0.1);
	border: none;
	font-size: 16px;
	height: auto;
	margin: 0;
	outline: 0;
	padding: 15px;
	width: 100%;
	background-color: #e8eeef;
	color: #8a97a0;
	box-shadow: 0 1px 0 rgba(0, 0, 0, 0.03) inset;
	margin-bottom: 30px;
}

submit {
	padding: 19px 39px 18px 39px;
	color: #FFF;
	background-color: #4bc970;
	font-size: 18px;
	text-align: center;
	font-style: normal;
	border-radius: 5px;
	width: 100%;
	border: 1px solid #3ac162;
	border-width: 1px 1px 3px;
	box-shadow: 0 -1px 0 rgba(255, 255, 255, 0.1) inset;
	margin-bottom: 10px;
}
</style>

</head>


<body>
 <%
        String userID ="" ;
    if(session.getAttribute("User")!=null)
       {
        userID=session.getAttribute("User").toString();
       }
       else{
       userID="";
       } %>
    
    
    
    
	<%
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningframework", "root", "rootqwer");


			Statement statement = con.createStatement();

			resultset = statement.executeQuery("select * from keywords");
	%>
	
        
        <br/>
        
        <form action="UploadServlet" method="post"
		enctype="multipart/form-data">

         <h3 style="color:blue">Select File: Keywords:</h3>
		 <select multiple name="keywords">
			<%
				while (resultset.next()) {
			%>
			<option><%=resultset.getString(1)%></option>
			<%
				}
			%>
		</select>





		<!--  		Select File: Keywords: <select multiple name="keywords">
			<option value="cc">CC</option>
			<option value="fc">FC</option>
			<option value="cse">CSE</option>
			<option value="cs">CS</option>
			<option value="fc">FC</option>
			<option value="vm">VM</option>
		</select>  -->
         <h3 style="color:blue">Others:</h3>
		 <input type="text" name="otherKw" /> <br /> 
                  <input type="hidden" name="email" value="<%=userID%>" /> 
                  
                  <%
                  System.out.println("*********** "+ userID +" *********************");
			%>
                  
                  
                 
                
                 
                 <input type="file" name="fname" /> <input type="submit" value="upload" />


	</form>


	<%
		//**Should I input the codes here?**
		} catch (Exception e) {
			out.println("wrong entry" + e);
		}
	%>
</body>
</html>




