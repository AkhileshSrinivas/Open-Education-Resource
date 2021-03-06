package Sample;

import java.io.*;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.oreilly.servlet.MultipartRequest;

public class UploadServlet extends HttpServlet {

	public static String location="C:\\Users\\akhil\\eclipse-workspace\\OER\\OpenEducationResource\\Download";
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		MultipartRequest m = new MultipartRequest(request,"C:\\Users\\akhil\\eclipse-workspace\\OER\\OpenEducationResource\\Download");
		//out.print("<h1 style="color:red"> ddddd </h1>");
                out.print("successfully uploaded");

		Enumeration files = m.getFileNames();

		String name = "";

		String filename = "";

		while (files.hasMoreElements()) {
			name = (String) files.nextElement();
			filename = m.getFilesystemName(name);
		}

		Set<String> keywordset = new HashSet<String>();
		
		HashSet<String> kwotherset = new HashSet<String>();
		
		

		try {
			Connection con = DBConnection.getConnection();

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("Select * from keywords");

			while (rs.next()) {
				String keyword = rs.getString(1);
				keywordset.add(keyword);
			}
            con.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}

		System.out.println("*********** "+ m.getParameter("email") +" *********************");
		String[] keywords = m.getParameterValues("keywords");
		System.out.println("*********** "+ keywords +" *********************");
                String res="";
                
                for(int i=0;i<keywords.length;i++)
                {
                    res=res+keywords[i]+",";
                    System.out.println("*********** "+ res+" *********************");
                }

                String email=m.getParameter("email");
                 
		String otherkeyvals = m.getParameter("otherKw");
                res=otherkeyvals+","+res;

		String[] others = otherkeyvals.split(",");
		System.out.println("*********** "+ filename +" "+ res +" " + email +" *********************");

		try {
			Connection con  = DBConnection.getConnection();
			//PreparedStatement ps = con.prepareStatement("INSERT INTO learningobjects(filename , keyword) values(? , ?)");
			Statement ps1 = con.createStatement();

            int q1=ps1.executeUpdate("INSERT INTO learningobjects1(filename,keyword,email) values('"+filename+"','"+res+"','"+email+"')");
			
			HashSet<String> uniqueKw = new HashSet<String>();

			for (int k = 0; k < keywords.length; k++) {

				uniqueKw.add(keywords[k]);
			}

			
			
			
			for (int k = 0; k < others.length; k++) {

				uniqueKw.add(others[k]);
				if (!keywordset.contains(others[k])) {
					kwotherset.add(others[k]);
				}

			}

			String totalkw = "";

			Iterator iter = uniqueKw.iterator();

			while (iter.hasNext()) {
				totalkw += iter.next() + ", ";
			}

			
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
		
		try {
			Connection con  = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("INSERT INTO keywords(keyword) values(?)");

			String []kw = new String[kwotherset.size()];
			
			Iterator iter = kwotherset.iterator();
			int i=0;
			
			while(iter.hasNext())
			{
				kw[i] = (String) iter.next();
				i++;
			}
			
            for(int j=0; j<kw.length; j++)
            {
            	ps.setString(1, kw[j]);
            	 ps.addBatch();
            }

           
            
            ps.executeBatch();
            
            ps.close();
            
            con.close();
            
		} catch (Exception ex) {
			System.out.println(ex);
		}

		

	}
}
