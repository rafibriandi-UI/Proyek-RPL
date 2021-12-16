package com.kelompok2.projecthaa.Controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "diabetest2Servlet", value = "/assessment/diabetest2")
public class diabetest2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int assessmentId = 2;
        String disease = request.getParameter("disease");
        double genRisk = Double.parseDouble(request.getParameter("genRisk"));

        request.setAttribute("disease", disease);
        request.setAttribute("genRisk", genRisk);

        request.getRequestDispatcher("/diabetesType2/diabetes2Assessment.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String symptoms1 = request.getParameter("symptoms1");
        String symptoms2 = request.getParameter("symptoms2");
        String symptoms3 = request.getParameter("symptoms3");
        String symptoms4 = request.getParameter("symptoms4");
        String symptoms5 = request.getParameter("symptoms5");

    }
}