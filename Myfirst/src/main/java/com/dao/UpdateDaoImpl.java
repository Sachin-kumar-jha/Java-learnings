package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDaoImpl implements UpdateDao {
    private String result;
	@SuppressWarnings("finally")
	@Override
	public String update(int salary, int eid) {
		
		Connection con = ConnectionFactory.getCon();
		String sql = "update pogo.employee set esalary=? where eid=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, salary);
			ps.setInt(2, eid);
			
			int row = ps.executeUpdate();
			if(row == 1) {
			result = "updated"	;
			}else {
				result ="failed";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result ="Something went wrong";
		}finally {
			return result;
		}
		
	}

}
