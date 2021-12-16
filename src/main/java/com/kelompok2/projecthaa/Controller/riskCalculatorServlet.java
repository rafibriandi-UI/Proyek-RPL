package com.kelompok2.projecthaa.Controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "riskCalculatorServlet", value = "/riskCalculator")
public class riskCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int assessmentId = Integer.parseInt(request.getParameter("assessmentId"));
        String smoking = request.getParameter("smoking");
        int physicalActivity = Integer.parseInt(request.getParameter("physicalActivity"));
        Boolean familyHistory = Boolean.parseBoolean(request.getParameter("familyHistory"));
        int cholesterol = Integer.parseInt(request.getParameter("cholesterolLevel"));
        int systolicBP = Integer.parseInt(request.getParameter("systolicBP"));
        int diastolicBP = Integer.parseInt(request.getParameter("diastolicBP"));
        int bloodSugar = Integer.parseInt(request.getParameter("bloodSugar"));
        Boolean existingDisease = Boolean.parseBoolean(request.getParameter("existingDisease"));

        String error;

        if (assessmentId == 0) {
            error = "Something's wrong, please try again.";
            request.setAttribute("error", error);
        } else if (assessmentId == 1){
            request.setAttribute("assessmentId", assessmentId);
//            error = "One or more of the input boxes were blank. Please try again.";
//            if (smoking == null || physicalActivity == 0 || cholesterol == 0 || systolicBP == 0
//                    || diastolicBP == 0 || bloodSugar == 0)
            getServletContext().getRequestDispatcher("/generalRiskFactor.jsp").forward(request, response);
        } else if (assessmentId == 2) {

        } else if (assessmentId == 3) {

        } else if (assessmentId == 4) {

        } else if (assessmentId == 5) {

        } else if (assessmentId == 6) {

        } else if (assessmentId == 7) {

        }
    }
}
