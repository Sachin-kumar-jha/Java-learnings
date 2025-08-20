package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.ReadPojo;

public class ReadDao {
   private  ResultSet rs;
	
	@SuppressWarnings("finally")
	public List<ReadPojo> readDao(int eid) {
		List<ReadPojo> list =new ArrayList<ReadPojo>();
		 try {
			Connection con = ConnectionFactory.getCon();
			String sql = "select * from industrial.employee where eid>=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, eid);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int eid1 = rs.getInt("eid");
				String name =rs.getString("ename");
				int salary = rs.getInt("esal");
				ReadPojo readpojo=new ReadPojo(eid1,name,salary);
				list.add(readpojo);
			}
			
		} catch (Exception e) {
		    e.printStackTrace();
		}finally {
		return list;
		}
	 }
}
