package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.ReadService;


@SuppressWarnings("serial")
public class Read extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int eid = Integer.parseInt(request.getParameter("eid"));
	ReadService read = new ReadService();
	boolean result = read.readService(eid);
	if(result) {
        response.sendRedirect("success.html");;	
	}else {
		response.sendRedirect("fail.html");
	}
	}

}
