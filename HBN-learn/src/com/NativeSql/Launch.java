package com.NativeSql;

import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.NativeQuery;


public class Launch {

	public static void main(String[] args) {
		
		SessionFactory sf = getSession();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("P1->Insert\nP2->Read\nP3->Update\nP4->Delete\n");
			System.out.println("ENTER CHOICE:");
			int choice = sc.nextInt();
			if(choice==7) {
				System.out.println("Thanks for Using");
				break;
			}
			
			switch(choice) {
			case 1:
				insert(sf);
				break;
			case 2:
				read(sf);
		        break;
			case 3:
		    System.out.println("update");
				break;
			case 4:
				break;
			case 5:
					break;
			default:
				System.out.println("Default called");
				break;
			}
		}
		//insert(session);
		

	}
	
	
	private static void insert(SessionFactory sessionfactory) {
		/* In hibernate here setAutoCommit 
		 * This is Native sql approach to bulk insert
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER EID");
		int eid = sc.nextInt();
		System.out.println("ENTER ENAME");
		String ename = sc.next();
		System.out.println("ENTER EADDRESS");
		String eaddress = sc.next();
		System.out.println("Enter Esalary");
		int esalary = sc.nextInt();
		Session session = sessionfactory.openSession();
		Transaction trns = session.beginTransaction();
		
//		String sql = "insert into sqlemployee(eid,ename,eaddress,esalary) values(:eid,:ename,:eaddress,:esalary)";
//If we want to seperate sql then we use NamedNativeQuery in Ent ity class
		
		NativeQuery nq = session.getNamedNativeQuery("insert");
		
		nq.setParameter("eid", eid);
		nq.setParameter("ename",ename);
		nq.setParameter("eaddress", eaddress);
		nq.setParameter("esalary",esalary);

	    
		int row = nq.executeUpdate();
		trns.commit();
		System.out.println(row);
		session.close();
		/*
		 * Here Connection back to pool 
		 * Cache memory free
		 * */
	}
	

	private static void read(SessionFactory sf) {
		Session session = sf.openSession();
		String sql= "select * from sqlEmployee";
		
		@SuppressWarnings("rawtypes")
		NativeQuery nq = session.createNativeQuery(sql);
		nq.addEntity(Employee.class);
		List<Employee> list=nq.getResultList();
		System.out.println(list);
//		@SuppressWarnings("rawtypes")
//		List<Object[]> rs = nq.getResultList();
//		for(Object[] e:rs) {
//			for(Object o:e) {
//				System.out.println(o);
//			}
//		}
	}
	
	private static SessionFactory getSession() {
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
 