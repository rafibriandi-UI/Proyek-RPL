package com.kelompok2.projecthaa.Controller;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    ResultSet rs;
    String userId;
    String userPassword;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Variable for register parameter
        String page = "userPage.jsp";
        String notes = "";
        String getRegister = request.getParameter("register");

        //URL redirects for register
        if (getRegister != null && getRegister.equals("SIGN UP")) {
            response.sendRedirect("Register.jsp");
        } else {

            try {

                //Initialize database connection
                Connection con = com.kelompok2.projecthaa.DAO.DbConnector.getDbConnection();

                //Create SQL Query to match user input with database
                String query = "SELECT user_id,user_password FROM useraccount " +
                        "WHERE user_id = ? AND user_password = ? ";


                PreparedStatement ps = con.prepareStatement(query);


                //get data using request object

                ps.setString(1, request.getParameter("user_id"));
                ps.setString(2, request.getParameter("user_password"));


                //execute query
                rs = ps.executeQuery();
                rs.next();

                //Save user input data to variable
                userId = rs.getString("user_id");
                userPassword = rs.getString("user_password");

                System.out.println(userId);
                System.out.println(userPassword);


                //Close connection
                ps.close();
                con.close();

            }

            //Error redirect
            catch (Exception e) {
                page = "index.jsp";
                notes = "Log in Failed! please check your User Id or Password amd try again";
            }

            //URL redirect here if login success
            request.setAttribute("notes", notes);
            request.getRequestDispatcher(page).forward(request, response);

        }
    }
}