package com.dao;

import java.util.List;
import java.util.Properties;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.NativeQuery;


public class Pagination {
	
	@SuppressWarnings("unchecked")
	public List<Employee> read(int start) {
		SessionFactory sf=getSession();
		Session session = sf.openSession();
		
		@SuppressWarnings("rawtypes")
		NativeQuery nq = session.getNamedNativeQuery("read");
		nq.addEntity(Employee.class);
		nq.setFirstResult(start);
		nq.setMaxResults(4);
		return nq.getResultList();
		
		
		
		
		
//		@SuppressWarnings("rawtypes")
//		List<Object[]> rs = nq.getResultList();
//		for(Object[] e:rs) {
//			for(Object o:e) {
//				System.out.println(o);
//			}
//		}
	}
	
	public int getTotalRecord() {
		SessionFactory sf=getSession();
		Session session = sf.openSession();
		
		@SuppressWarnings("rawtypes")
		NativeQuery nq = session.getNamedNativeQuery("records");
		 Object singleResult = nq.getSingleResult();
		System.out.println(singleResult.toString());
		return ((Number) singleResult).intValue();
		
	}
	
	public  SessionFactory getSession() {
		Configuration configuration = new Configuration();
		
		Properties properties =new Properties();
		properties.put(Environment.URL,"jdbc:mysql://localhost:3306/pogo?useSSL=false&allowPublicKeyRetrieval=true");
		properties.put(Environment.USER,"root");
		properties.put(Environment.PASS,"Sachin(123)Jha");
		properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		properties.put(Environment.HBM2DDL_AUTO,"update"); //If table not exist then create table automatically and here if we 
		//use create then drop the table and create new table.
		properties.put(Environment.SHOW_SQL,true);
		properties.put(Environment.FORMAT_SQL,true);
		
		configuration.setProperties(properties);
		//MAPPING  
		configuration.addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
	
		
		return sessionFactory;
	}
}
