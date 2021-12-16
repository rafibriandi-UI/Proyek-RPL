package com.kelompok2.haa.Controller;

import com.mysql.cj.callback.UsernameCallback;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.kelompok2.haa.DAO.DbConnector;
import com.kelompok2.haa.Controller.LoginServlet;



@WebServlet(name = "ProfileServlet", value = "/ProfileServlet")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        //Crate object from LoginServlet class
        LoginServlet t = new LoginServlet();

       //Request parameter

        String getAssessment = request.getParameter("assessment");
        String getHistory = request.getParameter("history");
        String getMenu = request.getParameter("menu");
        String getLogOut = request.getParameter("logout");


        //database connection
        try
        {

            //Initialize database connection
            Connection con = com.kelompok2.haa.DAO.DbConnector.getDbConnection();

            //Query for show username data from database
            String getUserName = "SELECT user_name FROM useraccount WHERE" +
                    "user_id = " + t.userId + "AND" + "user_password =" + t.userPassword;

            //Query for show user email from database
            String getUserEmail = "SELECT user_email FROM useraccount WHERE" +
                    "user_id = " + t.userId + "AND" + "user_password =" + t.userPassword;

            //Query for get user data from user
            String getUserData = "INSERT INTO userdata(height,weight,BMI) VALUES(?,?,?)";

            //Initialize statement
            PreparedStatement ps = con.prepareStatement(getUserName);
            PreparedStatement pt = con.prepareStatement(getUserEmail);
            PreparedStatement pu = con.prepareStatement(getUserData);



            //get data using request object

            ps.setString(1,request.getParameter("user_name"));
            pt.setString(1,request.getParameter("user_email"));
            pu.setFloat(1, Float.parseFloat(request.getParameter("height")));
            pu.setFloat(2, Float.parseFloat(request.getParameter("weight")));
            pu.setFloat(3, Float.parseFloat(request.getParameter("BMI")));

            //Execute query

            ps.executeQuery();
            pt.executeUpdate();
            pu.executeUpdate();

            //Close connection
            ps.close();
            con.close();

        }
        catch (Exception e)
        {
          e.printStackTrace();
        }

        //conditional for each parameter

        if ( getAssessment != null && getAssessment.equals("assessment"))
        {
            response.sendRedirect("assessment.jsp");

        }

        else if (getHistory != null && getAssessment.equals("history"))
        {
            response.sendRedirect(("index.jsp"));
        }

        else if (getMenu != null && getAssessment.equals("menu"))
        {
            response.sendRedirect(("index.jsp"));
        }

        else
        {
            response.sendRedirect("Login.jsp");
        }

    }
}
