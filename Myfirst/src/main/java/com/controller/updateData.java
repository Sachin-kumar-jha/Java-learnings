package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.UpdateService;


@SuppressWarnings("serial")
public class updateData extends HttpServlet {
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//		String eid = request.getParameter("eid");
//		System.out.println(eid);
//	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid =Integer.parseInt(request.getParameter("eid"));
		int salary =Integer.parseInt(request.getParameter("salary"));
		UpdateService updatedservice = new UpdateService();
		
		String result = updatedservice.updateservice(salary, eid);
		 if(result.equals("updated")) {
        	 response.sendRedirect("success.html");
         }else {
        	 response.sendRedirect("fail.html");
         }
	}

}
