package com.controller;

import com.dto.EmployeeDto;
import com.service.Service;

public class MyController {
   private Service MyService;
   
   public MyController() {
	   MyService=new Service();
   }
   
public String getData(EmployeeDto emp) {
		String result=MyService.getData(emp);
		return result;
}

public EmployeeDto[] ReadData() {
	EmployeeDto[] arr=MyService.ReadData();
	return arr;
}
}
