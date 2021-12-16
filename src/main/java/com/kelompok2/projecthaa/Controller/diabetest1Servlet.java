package com.kelompok2.projecthaa.Controller;

import com.kelompok2.projecthaa.Models.generalRiskCalculator;
import com.kelompok2.projecthaa.Models.riskCalculator;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "diabetest1Servlet", value = "/assessment/diabetest1")
public class diabetest1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int assessmentId = 1;
        String disease = request.getParameter("disease");
        double genRisk = Double.parseDouble(request.getParameter("genRisk"));

        request.setAttribute("disease", disease);
        request.setAttribute("genRisk", genRisk);

        request.getRequestDispatcher("/diabetesType1/diabetes1Assessment.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double genRisk = Double.parseDouble(request.getParameter("genRisk"));
        String disease = "diabetest1";

        String symptoms1 = request.getParameter("symptoms1");
        String symptoms2 = request.getParameter("symptoms2");
        String symptoms3 = request.getParameter("symptoms3");
        String symptoms4 = request.getParameter("symptoms4");
        String symptoms5 = request.getParameter("symptoms5");

        double risk = riskCalculator.calculate(disease, symptoms1, symptoms2, symptoms3, symptoms4, symptoms5, "notCount", "notCount");

        double totalRisk = genRisk + risk;

        request.setAttribute("totalrisk", totalRisk);
        if(totalRisk <= 30) {
            String color = "bg-green-400";
            String riskLevel = "Low Risk";
            request.setAttribute("color", color);
            request.setAttribute("riskLevel", riskLevel);

            request.getRequestDispatcher("/diabetesType1/diabetes1Assessment.jsp").forward(request, response);

        } else if (totalRisk <= 70 || totalRisk > 30) {
            String color = "bg-yellow-300";
            String riskLevel = "Medium Risk";
            request.setAttribute("color", color);
            request.setAttribute("riskLevel", riskLevel);

            request.getRequestDispatcher("/diabetesType1/diabetes1Assessment.jsp").forward(request, response);

        } else if (totalRisk > 70) {
            String color = "bg-red-400";
            String riskLevel = "High Risk!";
            request.setAttribute("color", color);
            request.setAttribute("riskLevel", riskLevel);

            request.getRequestDispatcher("/diabetesType1/diabetes1Assessment.jsp").forward(request, response);

        }
    }
}