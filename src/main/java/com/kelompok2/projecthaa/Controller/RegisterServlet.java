package com.kelompok2.projecthaa.Controller;

import com.kelompok2.projecthaa.DAO.DbConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;


@WebServlet(name = "RegisterServlet",value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
          try
          {
              //Initialize database connection
              Connection con = com.kelompok2.projecthaa.DAO.DbConnector.getDbConnection();

              //Create SQL Query to put data into table
              String query = "INSERT INTO useraccount(user_id,user_name,user_email,user_password)" +
                              "VALUES(?,?,?,?)";
              PreparedStatement ps = con.prepareStatement(query);

              //get data using request object
              ps.setString(1,request.getParameter("user_id"));
              ps.setString(2, request.getParameter("user_name"));
              ps.setString(3, request.getParameter("user_email"));
              ps.setString(4, request.getParameter("user_password"));

              //Execute query statement
              ps.executeUpdate();

              //Indicator that data insertion is successful
              response.sendRedirect("SuccessLogin.jsp");
          }
          catch (Exception e)
          {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
          response.sendRedirect("ErrorLogin.jsp");
    }


}
