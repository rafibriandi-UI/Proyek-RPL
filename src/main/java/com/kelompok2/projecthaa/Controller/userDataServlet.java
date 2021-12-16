package com.kelompok2.projecthaa.Controller;

import com.kelompok2.projecthaa.Models.BMI;
import com.kelompok2.projecthaa.Models.userData;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "userDataServlet", value = "/userData")
public class userDataServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double bmi;
        String bmiCondition;

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

        getServletContext().getRequestDispatcher("/regUserData.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/regUserData.jsp").forward(request, response);
    }
}
