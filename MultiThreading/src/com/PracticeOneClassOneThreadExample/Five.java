package com.PracticeOneClassOneThreadExample;

public class Five extends Thread{
 @Override
 public void run() {
	 String name=Thread.currentThread().getName();
	 System.out.println(name+"five");
	 for(int i=1;i<=10;i++) {
		 System.out.println("FIVE"+":"+5*i);
		 try {
			 //This is predefined method to sleep for given time
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
 }
}
