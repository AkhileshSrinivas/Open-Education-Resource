/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author toshiba
 */
public class edownload12 extends HttpServlet {
private static final long serialVersionUID = 1L;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  /*  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
          String email=  request.getParameter("lat");
           String id=   request.getParameter("lng");
            System.out.println(email);
             System.out.println(id);
            
            System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
            Connection con=DBConnection.getConnection();
           Statement st= con.createStatement();
            ResultSet rs=  st.executeQuery("select * from learningobjects1 where email='"+email+"' and id='"+id+"'");
          String fname="";
            while(rs.next())
           {
               fname=rs.getString("filename");
           }
          
            
            System.out.println("ffff===="+fname);
        }
    }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//String gurufile = "test.txt";
                
            String email=  request.getParameter("lat");
            String id = request.getParameter("lng");
            System.out.println(email);
             System.out.println(id);
            
            System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
            Connection con=DBConnection.getConnection();
           Statement st=null;
    try {
        st = con.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(edownload12.class.getName()).log(Level.SEVERE, null, ex);
    }
            ResultSet rs=null;
    try {
        rs = st.executeQuery("select * from learningobjects1 where email='"+email+"' and id='"+id+"'");
    } catch (SQLException ex) {
        Logger.getLogger(edownload12.class.getName()).log(Level.SEVERE, null, ex);
    }
          String fname="";
    try {
        while(rs.next())
        {
            fname=rs.getString("filename");
        }
    } catch (SQLException ex) {
        Logger.getLogger(edownload12.class.getName()).log(Level.SEVERE, null, ex);
    }
          
    
    String gurupath = "C:\\Users\\akhil\\eclipse-workspace\\OER\\OpenEducationResource\\Download\\";
        	response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-Disposition", "attachment; filename=\""
				+ fname + "\"");
 
		FileInputStream fileInputStream = new FileInputStream(gurupath+ fname);
 
		int i;
		while ((i = fileInputStream.read()) != -1) 
                {
			out.write(i);
		}
		fileInputStream.close();
		out.close();
    
      
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   

}

