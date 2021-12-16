package com.kelompok2.projecthaa.Controller;

import com.kelompok2.projecthaa.Models.BMI;
import com.kelompok2.projecthaa.Models.generalRiskCalculator;
import com.kelompok2.projecthaa.Models.userData;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "generalRiskCalculatorServlet", value = {"/assessment/generalRisk"})
public class generalRiskCalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int assessmentId = Integer.parseInt(request.getParameter("assessmentId"));
        String disease = request.getParameter("disease");

        request.setAttribute("assessmentId", assessmentId);
        request.setAttribute("disease", disease);

        String smoking = request.getParameter("smoking");
        String physicalActivity = request.getParameter("physicalActivity");
        String familyHistory = request.getParameter("familyHistory");
        String cholesterolLevel = request.getParameter("cholesterolLevel");
        String systolicBP = request.getParameter("systolicBP");
        String diastolicBP = request.getParameter("diastolicBP");
        String bloodSugar = request.getParameter("bloodSugar");
        String existingDisease = request.getParameter("existingDisease");

        request.setAttribute("smoking", smoking);
        request.setAttribute("physicalActivity", physicalActivity);
        request.setAttribute("familyHistory", familyHistory);
        request.setAttribute("cholesterolLevel", cholesterolLevel);
        request.setAttribute("systolicBP", systolicBP);
        request.setAttribute("diastolicBP", diastolicBP);
        request.setAttribute("bloodSugar", bloodSugar);
        request.setAttribute("existingDisease", existingDisease);

        String error;
        int genRisk;

        if(smoking.isBlank() || physicalActivity.isBlank() || familyHistory.isBlank()
        || cholesterolLevel.isBlank() || systolicBP.isBlank() || diastolicBP.isBlank()
        || bloodSugar.isBlank() || existingDisease.isBlank()) {
            error = "One or more of the input boxes were blank. Try again.";

            request.setAttribute("error", error);

        } else {
            switch (assessmentId) {
                case 1:
                case 2:
                    request.setAttribute("genRisk", generalRiskCalculator.calculate(assessmentId, physicalActivity, smoking, familyHistory, cholesterolLevel,
                            systolicBP, diastolicBP, bloodSugar, existingDisease));
                case 3:
                    request.setAttribute("genRisk", generalRiskCalculator.calculate(assessmentId, physicalActivity, smoking, familyHistory, cholesterolLevel,
                            "notCount", "notCount", "notCount", existingDisease));
                case 4:
                case 5:
                case 6:
                case 7:
                    request.setAttribute("genRisk", generalRiskCalculator.calculate(assessmentId, physicalActivity, smoking, "notCount", "notCount",
                            "notCount", "notCount", "notCount", existingDisease));

            }
        }

        getServletContext().getRequestDispatcher("/generalRiskFactor.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int assessmentId = Integer.parseInt(request.getParameter("assessmentId"));
        String disease = request.getParameter("disease");

        request.setAttribute("assessmentId", assessmentId);
        request.setAttribute("disease", disease);

        getServletContext().getRequestDispatcher("/generalRiskFactor.jsp").forward(request, response);
    }
}
