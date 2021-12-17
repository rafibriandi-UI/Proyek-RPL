package com.kelompok2.projecthaa.Controller;

import com.kelompok2.projecthaa.Models.riskCalculator;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "cvdServlet", value = "/assessment/cvd")
public class cvdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int assessmentId = 3;
        String disease = request.getParameter("disease");
        double genRisk = Double.parseDouble(request.getParameter("genRisk"));

        request.setAttribute("disease", disease);
        request.setAttribute("genRisk", genRisk);

        request.getRequestDispatcher("/cvd/cvdAssessment.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double genRisk = Double.parseDouble(request.getParameter("genRisk"));
        String disease = "cvd";

        String symptoms1 = request.getParameter("symptoms1");
        String symptoms2 = request.getParameter("symptoms2");
        String symptoms3 = request.getParameter("symptoms3");
        String symptoms4 = request.getParameter("symptoms4");
        String symptoms5 = request.getParameter("symptoms5");

        double risk = riskCalculator.calculate(disease, symptoms1, symptoms2, symptoms3, symptoms4, symptoms5, "notCount", "notCount");

        double totalRisk = genRisk + risk;

        request.setAttribute("symptoms1", symptoms1);
        request.setAttribute("symptoms2", symptoms2);
        request.setAttribute("symptoms3", symptoms3);
        request.setAttribute("symptoms4", symptoms4);
        request.setAttribute("symptoms5", symptoms5);
        request.setAttribute("totalRisk", totalRisk);

        if(totalRisk <= 30) {
            String color = "bg-green-400";
            String riskLevel = "Low Risk";
            request.setAttribute("color", color);
            request.setAttribute("riskLevel", riskLevel);

        } else if (totalRisk <= 65) {
            String color = "bg-yellow-300";
            String riskLevel = "Medium Risk";
            request.setAttribute("color", color);
            request.setAttribute("riskLevel", riskLevel);

        } else if (totalRisk > 65) {
            String color = "bg-red-400";
            String riskLevel = "High Risk";
            request.setAttribute("color", color);
            request.setAttribute("riskLevel", riskLevel);
        }

        request.getRequestDispatcher("/cvd/cvdReport.jsp").forward(request, response);

    }
}
