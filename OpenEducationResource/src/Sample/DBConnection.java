package Sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	static Connection con = null;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningframework", "root", "rootqwer");
		} catch (Exception e) {
			System.out.println(e);
		}

		return con;
	}
}