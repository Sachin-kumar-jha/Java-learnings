package com.mappinginhql;

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
				//readUsinghql(sf);
		        break;
			case 3:
				//readUsingSql(sf);
				break;
			case 4:
				//delete(sf);
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




	private static void insert(SessionFactory sf) {
	   Session session =sf.openSession();
	  
	   Transaction tr = session.beginTransaction();
	   Adhar adhar=new Adhar(0,"sachin");
	   Player p = new Player(1,"sachin",adhar);
	   session.save(p);
	   tr.commit();
	   session.close();
	}

	@SuppressWarnings("unchecked")
	private static void read(SessionFactory sessionfactory) {
			Session session = sessionfactory.openSession();
			
			
		}
		




		
		
		//This is for Annotation approach
		private static SessionFactory getSession() {
			Configuration configuration = new Configuration();
			
			Properties properties =new Properties();
			properties.put(Environment.URL,"jdbc:mysql://localhost:3306/industrial?useSSL=false&allowPublicKeyRetrieval=true");
			properties.put(Environment.USER,"root");
			properties.put(Environment.PASS,"Sachin(123)Jha");
			properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
			properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.HBM2DDL_AUTO,"create"); //If table not exist then create table automatically.
			properties.put(Environment.SHOW_SQL,true);
			properties.put(Environment.FORMAT_SQL,true);
			
			configuration.setProperties(properties);
			//MAPPING  
			configuration.addAnnotatedClass(Player.class);
			configuration.addAnnotatedClass(Adhar.class);
			
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			
		
			
			return sessionFactory;
		}

	

}
