package com.mainapp;

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
			insertForComplexClass(sf);
			break;
		case 2:
			read(sf);
	        break;
		case 3:
			update(sf);
			break;
		case 4:
			delete(sf);
			break;
		case 5:
				saveOrUpdate(sf);
				break;
		default:
			System.out.println("Default called");
			break;
		}
	}
	//insert(session);
	
	}

	private static void saveOrUpdate(SessionFactory sf) {
		Session session = sf.openSession();
		Transaction trs = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER EID");
		int eid = sc.nextInt();
		System.out.println("ENTER ENAME");
		String ename = sc.next();
		System.out.println("ENTER EADDRESS");
		String eaddress = sc.next();
		System.out.println("Enter Esalary");
		int esalary = sc.nextInt();
		
		Employee employee = new Employee(eid,ename,eaddress,esalary);
		System.out.println(employee);
		System.out.println("Enter name:");
		session.saveOrUpdate(employee);
		trs.commit();
		System.out.println("Saved and updated");
		

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

	private static void insertForComplexClass(SessionFactory sessionfactory) {
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
		
		System.out.println("Account Details:");
		System.out.println("ENTER AccountNo");
		int accNo=sc.nextInt();
		System.out.println("Enter bankName:");
		String bankName=sc.next();
		System.out.println("ENTER Amount");
		int amount = sc.nextInt();
		
		System.out.println("Education Details:");
		System.out.println("ENTER rollNo:");
		int rollNo=sc.nextInt();
		System.out.println("Enter clgName:");
		String clgName=sc.next();
		System.out.println("ENTER percent:");
		int percent = sc.nextInt();
		
		
		Account account = new Account(accNo,bankName,amount);
		Education education = new Education(rollNo,clgName,percent);
		
		
		ComlexEmployeeDatainsertion emp = new ComlexEmployeeDatainsertion(eid, ename, eaddress, esalary,account,education);
		
		int primaryKey = (int )session.save(emp);
		trns.commit();
		System.out.println(primaryKey);
		session.close();
		/*
		 * Here Connection back to pool 
		 * Cache memory free
		 * */
	}
	
private static void read(SessionFactory sessionfactory) {
		Session session = sessionfactory.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER EID");
		int eid = sc.nextInt();
		Employee employee = session.get(Employee.class, eid);
		
		System.out.println(employee);
		
		//Here not running another query here simple employee object is used from cached .
		//This is FIRST LEVEL CACHE
//       employee = session.get(Employee.class, eid);
//		System.out.println(employee);
		
		session.close();
	}
	
private static void update(SessionFactory sf) {
	Session session = sf.openSession();
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER EID");
	int eid = sc.nextInt();
	Employee employee = session.get(Employee.class, eid);
	System.out.println(employee);
if(employee!=null) {
	System.out.println("Enter new ename:");
	String ename = sc.next();
	employee.setEname(ename);
	
	Transaction trs = session.beginTransaction();
	session.update(employee);
	trs.commit();
	System.out.println("Updated");
	session.close();
}else {
	System.out.println("NOT EXIST");
	session.close();
	}
	
	}

	
private static void delete(SessionFactory sf) {
	Session session = sf.openSession();
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER EID");
	int eid = sc.nextInt();
	Employee employee = session.get(Employee.class, eid);
	if(employee !=null) {
		Transaction trs = session.beginTransaction();
		session.delete(employee);
		trs.commit();
		System.out.println("Deleted");
		session.close();
	}else {
		System.out.println("NOT Exists");
		session.close();
	}
		
	}


	


	

	
 //This is for XML Approach.
//	private static SessionFactory getSession() {
//		Configuration configuration = new Configuration();
//		configuration.configure();
//		/* 
//		 * How can this method knows what the name of configuration file.
//		 * Answer: Here uses Convention Over Configuration approach
//		 * 
//		 * 
//		 * We want Hibernate Setup Ready for me 
//		 * */
//		
//		//SETUP READY
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		
//		
//		/*
//		 * By this method we perform CRUD.
//		 * So here session object inherit Connection
//		 */
//		 
//		
//		return sessionFactory;
//	}
	
	//This is for Annotation approach
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
		configuration.addAnnotatedClass(ComlexEmployeeDatainsertion.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
	
		
		return sessionFactory;
	}

}
