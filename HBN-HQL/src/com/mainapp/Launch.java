package com.mainapp;

import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.Query;

public class Launch {

	public static void main(String[] args) {
	
	SessionFactory sf = getSession();
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("P1->copy\nP2->Read\nP3->Update\nP4->Delete\n");
		System.out.println("ENTER CHOICE:");
		int choice = sc.nextInt();
		if(choice==7) {
			System.out.println("Thanks for Using");
			break;
		}
		
		switch(choice) {
		case 1:
			copy(sf);
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

private static void copy (SessionFactory sessionfactory) {
	Session session = sessionfactory.openSession();
	
	String hql = "insert into Employee (eid,ename,eaddress,esalary) select eid,ename,eaddress,esalary from CopyEmployee";
	Transaction t=session.beginTransaction();
	Query query = session.createQuery(hql);
	
	int row = query.executeUpdate();
	System.out.println(row);
	t.commit();
	session.close();
}
@SuppressWarnings("unchecked")
private static void read(SessionFactory sessionfactory) {
		Session session = sessionfactory.openSession();
		
		String hql="from Employee"; 
		//Select * from Employee class 
		//so map table name in Employee enity class using 
		//@Table annotation
		
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery(hql);
		
		List<Employee> list = query.list();
		for(Employee e:list) {
			System.out.println(e);
		}
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
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(CopyEmployee.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
	
		
		return sessionFactory;
	}

}
