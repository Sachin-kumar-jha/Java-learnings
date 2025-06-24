package com.service;

import com.dao.MyDao;
import com.dto.EmployeeDto;

public class Service {
   private String result;
   private MyDao dao;
   
   public Service() {
	   dao=new MyDao();
   }
   
	public String getData(EmployeeDto emp) {
		String res=validateMyData(emp);
		if(res.equals("valid")) {
			res=dao.insert(emp);
			return res;
			//System.out.println("Store in Database");
		}else {
			return result;
		}
		
	}
	

   public EmployeeDto[] ReadData() {
	  EmployeeDto [] arr=dao.ReadData();
	  return arr;
   }
	private String validateMyData(EmployeeDto emp) {
		
		int id=emp.getEid();
		String Name=emp.geteName();
		String address=emp.getEaddress();
		int salary=emp.getSalary();
		
		if(id < 1 || id > 99 ) { 
			result="Invalid ID";
		}else if(Name.length()<2 || Name.length()>40) {
			 result="Please valid length of name";
		}
		else if(address.length()<2 || address.length()>50) {
			 result="Please valid length of name";
		}else if(salary <1000 || salary >10000) {
			result="Invalid Salary";
		}else {
			result="valid";
		}
			
		
		
		return result;
	}
}
