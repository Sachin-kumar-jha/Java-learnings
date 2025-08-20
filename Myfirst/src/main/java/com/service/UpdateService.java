package com.service;

import com.dao.UpdateDaoImpl;

public class UpdateService {
	
 public String updateservice(int salary,int eid) {
	 
	//do validation here
   // other business logic
	return new UpdateDaoImpl().update(salary,eid);
	 
 }
}
