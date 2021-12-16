package com.kelompok2.projecthaa.Controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "assessmentServlet", value = "/assessment")
public class assessmentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/assessment.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        int assessmentId = Integer.parseInt(request.getParameter("assessmentId"));
//        response.setContentType("text/html;charset=UTF-8");
//        String error = "Something's Wrong Please Try Again.";
//        PrintWriter out = response.getWriter();
//
//        request.getRequestDispatcher("/assessment.jsp").forward(request, response);
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Is it Cold or Flu?</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<a>href='/generalRiskFactor'</a>");
//            out.println("</body>");
//            doGet(request, response);

//        out.println("</html>");
    }
}
