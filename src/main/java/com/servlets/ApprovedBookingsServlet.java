package com.servlets;

import java.io.IOException;

import com.dao.impl.Booking_impl;
import com.dto.BookingDetails;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/approvedbookings")
public class ApprovedBookingsServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException{

        Booking_impl dao = new Booking_impl();

        request.setAttribute("bookings",
                dao.findApprovedBookings());

        request.getRequestDispatcher("approvedBookings.jsp")
        .forward(request,response);

    }

}