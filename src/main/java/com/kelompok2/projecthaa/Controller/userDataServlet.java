package com.kelompok2.projecthaa.Controller;

import com.kelompok2.projecthaa.Models.BMI;
import com.kelompok2.projecthaa.Models.userData;
import com.kelompok2.projecthaa.DAO.DbConnector;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.sql.ResultSet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



@WebServlet(name = "userDataServlet", value = "/userData")
public class userDataServlet extends HttpServlet {
    ResultSet rs;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double bmi;
        String bmiCondition;
        LoginServlet t = new LoginServlet();
        String name = request.getParameter("name");
        String sex = request.getParameter("gender");
        String age = request.getParameter("age");
        String htemp = request.getParameter("height");
        String wtemp = request.getParameter("weight");

        String error;
        if(name == null || sex == null || age == null || htemp == null || wtemp == null ||
                name.isBlank() || sex.isBlank() || htemp.isBlank() || wtemp.isBlank() ||
                age.isBlank()) {
            error = "One or more of the input boxes were blank. Try again.";

            request.setAttribute("error", error);

        } else {
            request.setAttribute("bmi", bmi = BMI.bmiCounter(htemp, wtemp));
            request.setAttribute("BMI", new BMI(htemp, wtemp, bmi));
            request.setAttribute("bmiCondition", bmiCondition = BMI.bmiCondition(bmi));
            userData person = new userData(name, sex, age, bmi, bmiCondition);
            request.setAttribute("userData", person);
        }

        //Error handling database connection

        try {
            //Initialize database connection
            Connection con = com.kelompok2.projecthaa.DAO.DbConnector.getDbConnection();

//Query for send username data
            String getUserName = "SELECT user_name FROM useraccount WHERE" +
                    "user_id = " + t.userId + "AND" + "user_password =" + t.userPassword;

//Query for Retrieve data from user
            String getUserData = "UPDATE useraccount " + " SET gender = ?, age = ?, height= ?, weight= ?, BMI= ?" +
                    "WHERE user_id = " + t.userId;


            //Initialize statement
            PreparedStatement pu = con.prepareStatement(getUserData);
            PreparedStatement pn = con.prepareStatement(getUserName);

            //get data using request object

            pu.setString(1, request.getParameter("gender"));
            pu.setInt(2, Integer.parseInt(request.getParameter(age)));
            pu.setFloat(3, Float.parseFloat(request.getParameter("height")));
            pu.setFloat(4, Float.parseFloat(request.getParameter("weight")));
            pn.setString(1, request.getParameter("user_name"));


            pn.setString(1, request.getParameter("user_name"));

            //get data using request object


            //execute query
            pu.executeUpdate();
            rs = pn.executeQuery();
            rs.next();

            //Close Connection
            pn.close();
            pu.close();
            con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        getServletContext().getRequestDispatcher("/regUserData.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/regUserData.jsp").forward(request, response);
    }
}