<%@page import="Sample.SearchServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
function download(){
	
	
    
});
</script>

<style>

body {
	
}


</style>
</head>
<body>

<form action="DownloadServlet" method="post">

	
	<%
		String userID = session.getAttribute("user_id").toString();
		System.out.println("User ID = " + userID);
		session.setAttribute("user_id", userID);
                

  String kw= session.getAttribute("keyw").toString();
  

System.out.println("mmmmmmmmmmmmmm"+kw);
	%>

        
       
  <%  if(kw.equalsIgnoreCase("file")|| kw.equalsIgnoreCase("Information") ||kw.equalsIgnoreCase("Validates") ||kw.equalsIgnoreCase("what is file?")
          || kw.equalsIgnoreCase("data") ||kw.equalsIgnoreCase("directory")||kw.equalsIgnoreCase("metadata")) 
    { %>
            
    <a href="p1.jsp" style="color:blue"> File Information Tool Set (FITS) - Projects at Harvard
        <p style="color:black"> The File Information Tool Set (FITS) identifies, validates and extracts technical metadata for a wide range of file formats. <br/>It acts as a wrapper, invoking and managing the output from several other open source tools. Output from these tools are converted into<br/> a common format, compared to one another and consolidated into a ...
        </p> </a>       
    
            
            <%
    }
  
  
  %>
  <%  if(kw.equalsIgnoreCase("file")|| kw.equalsIgnoreCase("Information") ||kw.equalsIgnoreCase("Validates") ||kw.equalsIgnoreCase("what is file?")
          || kw.equalsIgnoreCase("data") ||kw.equalsIgnoreCase("directory")||kw.equalsIgnoreCase("metadata")) 
    { %>
            
    <a href="p2.jsp" style="color:blue"> Retrieving File Information | Android Developers

        <p style="color:black"> https://developer.android.com/training/secure-file-sharing/retrieve-info.html
Before a client app tries to work with a file for which it has a content URI, the app can request information about the file from the server app, including the file's data type and file size. The data type helps the client app to determine if it can handle the file, and the file size helps the client app set up buffering and caching for the ...   </p> </a>       
    
            
            <%
    }
  
  
  %>
  <%  if(kw.equalsIgnoreCase("file")|| kw.equalsIgnoreCase("Information") ||kw.equalsIgnoreCase("Validates") ||kw.equalsIgnoreCase("what is file?")
          || kw.equalsIgnoreCase("data") ||kw.equalsIgnoreCase("directory")||kw.equalsIgnoreCase("metadata")) 
    { %>
            
    <a href="p3.jsp" style="color:blue"> Obtain important file information with these PHP file functions ...
        <p style="color:black">https://www.techrepublic.com/.../obtain-important-file-information-with-these-php-fil...
Jan 30, 2006 - This document lists every PHP file function a Web developer will ever need.</p> </a>       
    
            
            <%
    }
  
  
  %>
  <%  if(kw.equalsIgnoreCase("file")|| kw.equalsIgnoreCase("Information") ||kw.equalsIgnoreCase("Validates") ||kw.equalsIgnoreCase("what is file?")
          || kw.equalsIgnoreCase("data") ||kw.equalsIgnoreCase("directory")||kw.equalsIgnoreCase("metadata")) 
    { %>
            
    <a href="p4.jsp" style="color:blue">Print File Information - Finding Files - GNU.org
        <p style="color:black"> https://www.gnu.org/software/findutils/manual/html.../Print-File-Information.html
3.2 Print File Information. ? Action: -ls. True; list the current file in ' ls -dils ' format on the standard output. The output looks like this: 204744 17 -rw-r--r-- 1 djm staff 17337 Nov 2 1992 ./lwall-quotes. The fields are: The inode number of the file. See Hard Links, for how to find files based on their inode number. the number of ...</p> </a>       
    
            
            <%
    }
  
  
  %>
  <%  if(kw.equalsIgnoreCase("file")|| kw.equalsIgnoreCase("Information") ||kw.equalsIgnoreCase("Validates") ||kw.equalsIgnoreCase("what is file?")
          || kw.equalsIgnoreCase("data") ||kw.equalsIgnoreCase("directory")||kw.equalsIgnoreCase("metadata")) 
    { %>
            
    <a href="p5.jsp" style="color:blue">How to file Info - Competition Commission of India

        <p style="color:black"> www.cci.gov.in/sites/default/files/advocacy_booklet.../How%20to%20file%20Info.pdf
by A SERIES
WHO CAN FILE THE INFORMATION ? * Any person, consumer or their association or trade association can file information before the Commission. Central Govt. or a State Govt. or a statutory authority can also make a reference to the Commission for making an inquiry. ?Person? includes an individual, Hindu Undivided.  </p> </a>       
    
            
            <%
    }
  
  
  %>
  <%  if(kw.equalsIgnoreCase("file")|| kw.equalsIgnoreCase("Information") ||kw.equalsIgnoreCase("Validates") ||kw.equalsIgnoreCase("what is file?")
          || kw.equalsIgnoreCase("data") ||kw.equalsIgnoreCase("directory")||kw.equalsIgnoreCase("metadata")) 
    { %>
            
    <a href="p6.jsp" style="color:blue"> File Information Tool Set (FITS) - Projects at Harvard
        <p style="color:black"> The File Information Tool Set (FITS) identifies, validates and extracts technical metadata for a wide range of file formats. <br/>It acts as a wrapper, invoking and managing the output from several other open source tools. Output from these tools are converted into<br/> a common format, compared to one another and consolidated into a ...
        </p> </a>       
    
            
            <%
    }
  
  
  %>
  <%  if(kw.equalsIgnoreCase("file")|| kw.equalsIgnoreCase("Data Structure") ||kw.equalsIgnoreCase("Validates") ||kw.equalsIgnoreCase("what is file?")
          || kw.equalsIgnoreCase("data") ||kw.equalsIgnoreCase("directory")||kw.equalsIgnoreCase("metadata")) 
    { %>
            
    <a href="p7.jsp" style="color:blue"> File Information Tool Set (FITS) - Projects at Harvard
        <p style="color:black"> www.cci.gov.in/sites/default/files/advocacy_booklet.../How%20to%20file%20Info.pdf
by A SERIES
WHO CAN FILE THE INFORMATION ? * Any person, consumer or their association or trade association can file information before the Commission. Central Govt. or a State Govt. or a statutory authority can also make a reference to the Commission for making an inquiry. ?Person? includes an individual, Hindu Undivided.  </p> </a>       
    
            
            <%
    }
  
  
  %>
  <%  if(kw.equalsIgnoreCase("file")|| kw.equalsIgnoreCase("Information") ||kw.equalsIgnoreCase("Validates") ||kw.equalsIgnoreCase("what is file?")
          || kw.equalsIgnoreCase("data") ||kw.equalsIgnoreCase("directory")||kw.equalsIgnoreCase("metadata")) 
    { %>
            
    <a href="p8.jsp" style="color:blue"> File Information Tool Set (FITS) - Projects at Harvard
        <p style="color:black"> The File Information Tool Set (FITS) identifies, validates and extracts technical metadata for a wide range of file formats. <br/>It acts as a wrapper, invoking and managing the output from several other open source tools. Output from these tools are converted into<br/> a common format, compared to one another and consolidated into a ...
        </p> </a>       
    
            
            <%
    }
  
  
  %>
  <%  if(kw.equalsIgnoreCase("file")|| kw.equalsIgnoreCase("Information") ||kw.equalsIgnoreCase("Validates") ||kw.equalsIgnoreCase("what is file?")
          || kw.equalsIgnoreCase("data") ||kw.equalsIgnoreCase("directory")||kw.equalsIgnoreCase("metadata")) 
    { %>
            
    <a href="p9.jsp" style="color:blue"> File Information Tool Set (FITS) - Projects at Harvard
        <p style="color:black"> The File Information Tool Set (FITS) identifies, validates and extracts technical metadata for a wide range of file formats. <br/>It acts as a wrapper, invoking and managing the output from several other open source tools. Output from these tools are converted into<br/> a common format, compared to one another and consolidated into a ...
        </p> </a>       
    
            
            <%
    }
  
  
  %>
  <%  if(kw.equalsIgnoreCase("file")|| kw.equalsIgnoreCase("Information") ||kw.equalsIgnoreCase("Validates") ||kw.equalsIgnoreCase("what is file?")
          || kw.equalsIgnoreCase("data") ||kw.equalsIgnoreCase("directory")||kw.equalsIgnoreCase("metadata")) 
    { %>
            
    <a href="p10.jsp" style="color:blue"> File Information Tool Set (FITS) - Projects at Harvard
        <p style="color:black"> www.cci.gov.in/sites/default/files/advocacy_booklet.../How%20to%20file%20Info.pdf
by A SERIES
WHO CAN FILE THE INFORMATION ? * Any person, consumer or their association or trade association can file information before the Commission. Central Govt. or a State Govt. or a statutory authority can also make a reference to the Commission for making an inquiry. ?Person? includes an individual, Hindu Undivided. </p> </a>       
    
            
            <%
    }
  
  
  %> 
<center>
  <h3 style="color:blue">Download The Files</h3>
  
  How do you rate the Material
	
	<table style="color:blue" border="2">
		<tr>
			<td>File Name</td>
			<td>Feedback</td>
		</tr>
		
		<%
		System.out.println("---********="+SearchServlet.filenameset);
			for(String c : SearchServlet.filenameset)
                        {
			
				String fileName = c;
                                
        System.out.println("---********="+c);
		%>
		<tr>
		<td><%=fileName%></td>
		<td>
			<INPUT TYPE="radio" NAME="rating<%=fileName%>" VALUE = "poor"> Poor<br/> 
			<INPUT TYPE="radio" NAME="rating<%=fileName%>" VALUE = "good"> Good <br/>
			<INPUT TYPE="radio" NAME="rating<%=fileName%>" VALUE="very good" CHECKED> Very Good <br/>
			<INPUT TYPE="radio" NAME="rating<%=fileName%>" VALUE = "excellent"> Excellent	<br/>	
		</td>
		<td><input onclick= "download()" type="submit" value="Download">Download</td>
		</tr>
		<%} %>
		
	</table>
	
 
<BR><BR>

  
  
  </center>

</form>



</body>
</html>