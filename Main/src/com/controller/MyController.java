package com.controller;

import com.dto.Employee;
import com.service.MyService;
import com.service.MyServiceImpl;

public class MyController {
	
	private MyService service;
	
   public MyController() {
		service=new MyServiceImpl(); 
	}

	public String getData(Employee emp ) {
    	return service.insert(emp);
       }
	
	public Employee[] read() {
		return service.read();
	}
}
