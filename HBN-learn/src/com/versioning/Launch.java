package com.versioning;

import java.util.Properties;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;


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
		        break;
			case 3:
				update(sf);
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
		 * always false so here we need to start transaction
		 * */
		Session session = sessionfactory.openSession();
		Transaction trns = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER EID");
		int eid = sc.nextInt();
		System.out.println("ENTER ENAME");
		String ename = sc.next();
		System.out.println("ENTER EADDRESS");
		String eaddress = sc.next();
		System.out.println("Enter Esalary");
		int esalary = sc.nextInt();
		
		Employee emp = new Employee(eid, ename, eaddress, esalary);
		
		int primaryKey = (int )session.save(emp);
		trns.commit();
		System.out.println(primaryKey);
		session.close();
		/*
		 * Here Connection back to pool 
		 * Cache memory free
		 * */
	}
	
	
	private static void update(SessionFactory sf) {
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER EID");
		int eid = sc.nextInt();
		Employee employee = session.get(Employee.class, eid);
		int version=employee.getVersion();
		System.out.println(version);
		System.out.println(employee.toString());
		
	if(version<=2) {
		System.out.println("Enter new ename:");
		String ename = sc.next();
		employee.setEname(ename);
		
		Transaction trs = session.beginTransaction();
		session.update(employee);
		trs.commit();
		System.out.println("Updated");
		session.close();
	}else {
		System.out.println("LIMIT EXCEEDED");
		session.close();
		}
		
		}

	
	private static SessionFactory getSession() {
		Configuration configuration = new Configuration();
		
		Properties properties =new Properties();
		properties.put(Environment.URL,"jdbc:mysql://localhost:3306/pogo?useSSL=false&allowPublicKeyRetrieval=true");
		properties.put(Environment.USER,"root");
		properties.put(Environment.PASS,"Sachin(123)Jha");
		properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		properties.put(Environment.HBM2DDL_AUTO,"update"); //If table not exist then create table automatically.
		properties.put(Environment.SHOW_SQL,true);
		properties.put(Environment.FORMAT_SQL,true);
		
		configuration.setProperties(properties);
		//MAPPING  
		configuration.addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
	
		
		return sessionFactory;
	}

}
