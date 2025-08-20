package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class Servlet1 extends HttpServlet {
	
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ServletContext servletContext=getServletContext();
	servletContext.setAttribute("xyz","HelloJava");
  String data =servletContext.getInitParameter("myData");
  System.out.println("SERVLET:1 " + data);
 ServletConfig servletconfig= getServletConfig();
 String servlet1Data=servletconfig.getInitParameter("Key1");
 String servlet2Data=servletconfig.getInitParameter("Key2");
 System.out.println("Servlet1 key2 value "+servlet2Data);
 System.out.println("Servlet1 key1 value " +servlet1Data );
 
		response.sendRedirect("index.html");
	}

}
