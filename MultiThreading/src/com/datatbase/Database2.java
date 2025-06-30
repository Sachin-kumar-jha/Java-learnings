package com.datatbase;

public class Database2 extends Thread {
	
  public String collect[]=new String[4];
	
 @Override 
 public void run() {
	 String name= Thread.currentThread().getName();
	 String data[]= {"d1","d2","d3","d4"};
	 System.out.println(name +" "+"db2");
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
 
 
