package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class Test extends HttpServlet {
//private List<Object>list;
//       static {
//    	   System.out.println("Servlet Loading");
//       }
//   
//    public Test() {
//        super();
//        System.out.println("constructor called");
//      
//    }

	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

//    @Override
//    public void init() throws ServletException{
// 	   System.out.println("inti 1");
//    }
//    @Override
//   public void init(ServletConfig config) throws ServletException{
//     String configData=config.getInitParameter("isArrayList");
//     if(configData.equals("true")) {
//    	  list=new ArrayList<Object>(); 
//     }else {
//    	 list=new LinkedList<Object>();
//     }
//     
//	  System.out.println("inti 2");
//	   
//   }
//    
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//    	System.out.println("service");
//    	String method = req.getMethod();
//    	if(method.equalsIgnoreCase("GET")) {
//    		doGet(req, res);
//    	}else {
//    		doPost(req, res);
//    	}
//    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("post");
		String eid = request.getParameter("eid");
		PrintWriter writer = response.getWriter();
		writer.print("Welcome :"+eid);
		System.out.println("EID "+eid);
		//Here this method redirect here not using same request in different servlet.
		//response.sendRedirect("eid");
		
		//Here we will use dispatcher to send same request ,response body to the another servlet .
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Servlet1");
		
//		requestDispatcher.forward(request, response);
		//Here in Test servlet written code not considered to print and want servlet collaboration with here all logs then use .include method
		requestDispatcher.include(request, response);
		
//		System.out.println(eid);
//		list.add(eid);
//		System.out.println("List class"+list.getClass()+"->"+list);
//		list.clear();
	} 
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get");
		
	}

	@Override
		public void destroy() {
			System.out.println("Resource Deallocation");
		}
}
