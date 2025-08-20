package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.InsertServiceImpl;

//@WebServlet("/Insert")

@SuppressWarnings("serial")
public class InsertData extends HttpServlet {
	
   private String result;    
  
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String ename = request.getParameter("ename");
			String eaddress = request.getParameter("eaddress");
			int esalary = Integer.parseInt(request.getParameter("esalary"));
			System.out.println(ename + " "+eaddress + " "+esalary);
			InsertServiceImpl inservice = new InsertServiceImpl();
	        result = inservice.insertData(ename, eaddress, esalary);
	         System.out.println(result);
	         if(result.equals("saved")) {
	        	 response.sendRedirect("success.html");
	         }else {
	        	 response.sendRedirect("fail.html");
	         }
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
         
	}

}
