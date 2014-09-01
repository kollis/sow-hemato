package com.sow.hemato.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public TestServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("\n****in doPost of TestServlet******");
		
		PrintWriter out = response.getWriter();
		
		out.print("{\"supplyDetail\": [{\"id\": \"1\", \"group\": \"A+\", \"liters\" : \"25\", \"bloodBank\":\"Suraksha\", \"city\":\"Hyderabad\"},{\"id\": \"2\", \"group\": \"B-\", \"liters\" : \"12\", \"bloodBank\":\"Pranadatha\", \"city\":\"Hyderabad\"}, {\"id\": \"3\", \"group\": \"O+\", \"liters\" : \"8\", \"bloodBank\":\"NTR\", \"city\":\"Hyderabad\"}]}");
		
		
	}

}
