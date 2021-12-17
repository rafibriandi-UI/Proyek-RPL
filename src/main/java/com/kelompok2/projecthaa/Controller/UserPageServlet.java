package com.kelompok2.projecthaa.Controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "UserPageServlet", value = "/UserPageServlet")
public class UserPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        //Request parameter

        String getAssessment = request.getParameter("assessment");
        String getHistory = request.getParameter("history");
        String getProfile = request.getParameter("profile");
        String getLogOut = request.getParameter("logout");

        //URL redirects for each button
        if (getAssessment != null && getAssessment.equals("assessment")) {
            response.sendRedirect("Register.jsp");
        } else if (getHistory != null && getHistory.equals("history")) {
            response.sendRedirect("Register.jsp");
        } else if (getProfile != null && getProfile.equals("profile")) {
            response.sendRedirect("Profile.jsp");
        } else if (getLogOut != null && getLogOut.equals("logout")) {
            response.sendRedirect("Login.jsp");
        }
    }
}

