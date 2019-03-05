/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Connector;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mitch
 */
public class Registration extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String fname = request.getParameter("FName");
        String lname = request.getParameter("LName");
        String driverID = request.getParameter("DriverId");
        String Password = request.getParameter("password");
        if(fname.isEmpty() || lname.isEmpty() || driverID.isEmpty() || Password.isEmpty())
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            out.print("<font color=red>Please fill all the fields</font>");
            rd.include(request, response);
        }
        else{
            try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/driverproject","admin","");
                    String query = "insert into users(fname,lname,password,driverID) values(?,?,?,?)";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, fname);
                    ps.setString(2, lname);
                    ps.setString(3, Password);
                    ps.setInt(4, Integer.parseInt(driverID));
                    ps.executeUpdate();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch ( SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

