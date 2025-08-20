package com.validation;

public class InsetValidation {
	private String res;
 @SuppressWarnings("finally")
public String validate(String ename,String eaddress,int esalary) {
	 try {
	   int namelen = ename.length();
	   int addlen = eaddress.length();
	   
	   if(namelen<2 || namelen >30) {
		   res = "Invalid Name";
	   }else if(addlen <10 || addlen >100) {
		   res = "Invalid address";
	   }else if(esalary <1000 || esalary >10000) {
		   res = "Invalid salary";
	   }else {  
		   res = "valid";
	   }
	   
	} catch (Exception e) {
		e.printStackTrace();
		res="Something went wrong";
	}finally {
		return res;
	}
	
	 
 }
}
