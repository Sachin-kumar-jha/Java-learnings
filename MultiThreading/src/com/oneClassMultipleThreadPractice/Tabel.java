package com.oneClassMultipleThreadPractice;
//This is Using Thread Class

/*
public class Tabel extends Thread{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		 System.out.println(name);
		 if(name.equalsIgnoreCase("raju")) {
			 five(name);
		 }else if(name.equalsIgnoreCase("kaju")) {
			 eight(name);
		 }else {
			 nine(name);
		 }
		/* 
		 * This is for example OneClassOneThread
		 * 
		 * 
		
		 for(int i=1;i<=10;i++) {
			 System.out.println("SEVEN"+":"+7*i);
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		 
		 
	}
	
	public void five(String name) {
		System.out.println("Thread"+":"+" "+name);
		for(int i=1;i<=10;i++) {
			 System.out.println("FIVE"+":"+5*i);
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void eight(String name) {
		System.out.println("Thread"+":"+" "+name);
		for(int i=1;i<=10;i++) {
			 System.out.println("Eight"+":"+8*i);
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void nine(String name) {
		System.out.println("Thread"+":"+" "+name);
		for(int i=1;i<=10;i++) {
			 System.out.println("NINE"+":"+9*i);
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
 
}

}
*/


/**
Runnable implementation Below
 */

public class Tabel implements Runnable{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		 System.out.println(name);
		 if(name.equalsIgnoreCase("raju")) {
			 five(name);
		 }else if(name.equalsIgnoreCase("kaju")) {
			 eight(name);
		 }else {
			 nine(name);
		 }
	}	 
		/* 
		 * This is for example OneClassOneThread
		
		 for(int i=1;i<=10;i++) {
			 System.out.println("SEVEN"+":"+7*i);
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		 
		 
	}
	*/
	public void five(String name) {
		System.out.println("Thread"+":"+" "+name);
		for(int i=1;i<=10;i++) {
			 System.out.println("FIVE"+":"+5*i);
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void eight(String name) {
		System.out.println("Thread"+":"+" "+name);
		for(int i=1;i<=10;i++) {
			 System.out.println("Eight"+":"+8*i);
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void nine(String name) {
		System.out.println("Thread"+":"+" "+name);
		for(int i=1;i<=10;i++) {
			 System.out.println("NINE"+":"+9*i);
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
 
}

}