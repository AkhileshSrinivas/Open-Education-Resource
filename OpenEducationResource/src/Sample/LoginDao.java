package Sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
	
	public String autheticateUser(LoginBean loginBean)
	{
		String userName = loginBean.getUserName();
		System.out.println(userName);
		String password = loginBean.getPassword();
		System.out.println(password);
		 Connection con = null;
		 Statement statement = null;
		 ResultSet resultSet = null;
		 
		 String userNameDB = "";
		 String passwordDB = "";
		 String roleDB = "";
		 
		
		 
		 try
		 {
			 con = DBConnection.getConnection();
			 statement = con.createStatement();
			 resultSet = statement.executeQuery("select name,Password,Role from users");
			 
			 while(resultSet.next())
			 { 
			 
				 userNameDB = resultSet.getString("name");
				 System.out.println(userNameDB);
				 passwordDB = resultSet.getString("Password");
				 System.out.println(passwordDB);
				 roleDB = resultSet.getString("Role");
				 System.out.println(roleDB);
			 if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Lecturer")) {
				 return "Lecturer_Role";
			 }
			 
			 if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("User")) { 
				 return "User_Role";
			 }           
             if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Editor")) {  
				 System.out.println("***********Editor*********************");
				 return "Editor";
             }
                         
			 }
			 
			 con.close();
			 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
		 return "Invalid User Credentials";
		
	}

}
