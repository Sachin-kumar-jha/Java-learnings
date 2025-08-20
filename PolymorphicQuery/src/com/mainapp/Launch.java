package com.mainapp;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.NativeQuery;
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
		  insert(sf);
			break;
		case 2:
			readUsinghql(sf);
	        break;
		case 3:
			readUsingSql(sf);
			break;
		case 4:
			delete(sf);
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


private static void readUsingSql(SessionFactory sf) {
	Session session = sf.openSession();
	String sql1 = "SELECT p.pid, p.pname, c.ctype, c.crun FROM player p JOIN cricator c ON p.pid = c.pid "
            + "UNION ALL "
            + "SELECT p.pid, p.pname, f.ftype, f.fgoals FROM player p JOIN footballer f ON p.pid = f.pid";

    NativeQuery nq = session.createNativeQuery(sql1);
     List<Object[]>list = nq.getResultList();
     System.out.println(list.toString());
     for(Object[]arr:list) {
    	 for(Object abj :arr) {
    		 System.out.println(abj);
    	 }
    	 System.out.println();
     }
	}


private static void readUsinghql(SessionFactory sf) {
 Session session = sf.openSession();
 
 String sql = "from Player";
 
  @SuppressWarnings("rawtypes")
  Query query = session.createQuery(sql);
  @SuppressWarnings("unchecked")
  List<Player>list =query.list(); //Here both child classes exists  but zero parameterized constructor needed; 

  for(Player p:list) {
	  if(p instanceof Cricator) {
		  Cricator c =(Cricator)p;
		  System.out.println(c.getPid());
		  System.out.println(c.getPname());
		  System.out.println(c.getCtype());
		  System.out.println(c.getCrun());
		  
	  }else {
		  Footballer f = (Footballer) p;
		  System.out.println(f.getPid());
		  System.out.println(f.getPname());
		  System.out.println(f.getFtype());
		  System.out.println(f.getFgoals());
		  
	  }
  }
	}


private static void insert(SessionFactory sf) {
   Session session =sf.openSession();
   Scanner sc = new Scanner(System.in);
   System.out.println("----------------Enter for Criketer");
   System.out.println("Enter pid");
   int pid = sc.nextInt();
   System.out.println("Enter player cname");
   String pname=sc.next();
   System.out.println("enter player ctype:");
   String type=sc.next();
   System.out.println("Enter player crun");
   int score = sc.nextInt();
   System.out.println("----------------Enter for Footballer");
   System.out.println("Enter fpid");
   int fpid = sc.nextInt();
   System.out.println("Enter player fname");
   String fpname=sc.next();
   System.out.println("enter player ftype:");
   String ftype=sc.next();
   System.out.println("Enter player fgoal");
   int fgoal = sc.nextInt();
   Transaction tr = session.beginTransaction();
   
   Cricator cricator = new Cricator(pid,pname,score,type);
   Footballer footballer = new Footballer(fpid,fpname,fgoal,ftype);
   session.save(cricator);
   session.save(footballer);
   
   
   tr.commit();
   session.close();
}

@SuppressWarnings("unchecked")
private static void read(SessionFactory sessionfactory) {
		Session session = sessionfactory.openSession();
		
		
	}
	
private static void update(SessionFactory sf) {
	Session session = sf.openSession();
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER EID");
	int eid = sc.nextInt();

	
	
	}

	
private static void delete(SessionFactory sf) {
	
		
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
		configuration.addAnnotatedClass(Player.class);
		configuration.addAnnotatedClass(Cricator.class);
		configuration.addAnnotatedClass(Footballer.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
	
		
		return sessionFactory;
	}

}
