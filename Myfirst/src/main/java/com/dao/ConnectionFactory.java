package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
     @SuppressWarnings("finally")
	public static Connection getCon(){
    	 Connection con =null;
    	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306?useSSL=false&allowPublicKeyRetrieval=true";
			String username ="root";
			String password = "Sachin(123)Jha";
			
			 con = DriverManager.getConnection(url,username,password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			return con;
		}
     }
}
