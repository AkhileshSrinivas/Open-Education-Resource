package Sample;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class DownloadServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		File folder = new File(UploadServlet.location);
		HttpSession session = request.getSession();
		File[] listOfFiles = folder.listFiles();
		String userID = session.getAttribute("user_id").toString();
		System.out.println("@@@@" + userID);
	
		Connection  con = null;
		
		try {
			con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into feedback(filename , rating , username) values(?,?,?)");

			for (String c : SearchServlet.filenameset) {

				String fileName = c;

				String rating = request.getParameter("rating" + fileName);

				ps.setString(1, fileName);

				ps.setString(2, rating);
				
				ps.setString(3, userID);

				ps.addBatch();

			}

			ps.executeBatch();

			int i = ps.executeUpdate();
			con.close();

		} catch (Exception e2) {
			System.out.println(e2);
		}

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				if (SearchServlet.filenameset.contains(listOfFiles[i].getName())) {
					String filepath =  "E://Workspace/search_key/Files/";
					response.setContentType("APPLICATION/OCTET-STREAM");
					response.setHeader("Content-Disposition",
							"attachment; filename=\"" + listOfFiles[i].getName() + "\"");

					// String path = filepath + "\\" +listOfFiles[i].getName();
					FileOutputStream writer = new FileOutputStream(new File(filepath + listOfFiles[i].getName()));
					FileInputStream fileInputStream = new FileInputStream(
							new File( "E://Workspace/search_key/Files/" + listOfFiles[i].getName()));

					int j;
					while ((j = fileInputStream.read()) != -1) {
						writer.write(j);
					}
				}
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}
		}

	}

}
