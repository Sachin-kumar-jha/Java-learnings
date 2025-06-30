package com.datatbase;

public class Database1 extends Thread{
	 public String collect[]=new String[4];
		
	 @Override 
	 public void run() {
		 String name= Thread.currentThread().getName();
		 String data[]= {"xd1","xd2","xd3","xd4"};
		 System.out.println(name +" "+"db1");
		 int i=0;
		 for(String d:data) {
			 collect[i]=d;
			
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			
		 }
			 i++; 
		 System.out.println("Data"+i+"COLLECT");
		 
	 }
}
}
