package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertDaoImpl implements InsertDao {
 private String result;
	@SuppressWarnings("finally")
	@Override
	public String insert(String ename, String eaddress, int esalary) {
		try {
			Connection con = ConnectionFactory.getCon();
			
			String sql = "insert into pogo.employee(ename,eaddress,esalary) values(?,?,?)";
			            PreparedStatement ps = con.prepareStatement(sql);
			     ps.setString(1,ename);
			     ps.setString(2,eaddress);
			     ps.setInt(3, esalary);
			     
			   int row=  ps.executeUpdate();
			   if(row == 1) {
				   result = "saved";
			   }
			 
		} catch (Exception e) {
			e.printStackTrace();
			result = "failed";
		}finally {
			return result;
		}
	
	}

}
