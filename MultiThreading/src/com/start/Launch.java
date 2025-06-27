package com.start;

import com.oneClassMultipleThreadPractice.Tabel;

//import MultiThreadingUsingRunnableinterface.MultiThreadwithRunnable;
//import MultiThreadingUsingRunnableinterface.multithreadusingRunnableEx2;

//import com.PracticeOneClassOneThreadExample.Five;
//import com.oneClassMultipleThreadPractice.*;



public class Launch {

	public static void main(String[] args) {
//oneClassoneThreadExample
//		Seven seven=new Seven();
//		Five five=new Five();

//Which thread class object created first this is registered first by the ThreadScheduler
//And run randomly by os.
//		
//		five.setName("Thread raju");
//		seven.setName("Thread kaju");
		
//		seven.start();//Thread created and Registered by threadScheduler
//		five.start();//Thread created and Registered

		
/*
  For oneClassMultipleThread Example using Thread Class
 	
		Tabel t1=new Tabel();
		Tabel t2=new Tabel();
		Tabel t3=new Tabel();
		
		t1.setName("Raju");
		t2.setName("kaju");
		t3.setName("maju");
		
		t1.start();
		t2.start();
		t3.start();
		
//Here multiThreading by extending thread class here an problem occur here when a 
//class create thread using extends thread class it has not access to extends other 
//for overcome this problem we use Runnable interface implementation
	
*/
		
// For oneClassMultipleThread using Runnable implementation;//
	  
		Runnable Tabel1=new Tabel();
		Runnable Tabel2=new Tabel();
		Runnable Tabel3=new Tabel();
		

		Thread t1=new Thread(Tabel1);
		Thread t2=new Thread(Tabel2);
		Thread t3=new Thread(Tabel3);
		
		t1.setName("raju");
		t2.setName("kaju");
		t3.setName("maju");
		
		t1.start();
		t2.start();
		t3.start();
		
	
/*
Runnable Example below for oneclassOneThread

		Runnable MultiThreadwithRunnable=new MultiThreadwithRunnable();
		Runnable multithreadusingRunnableEx2=new multithreadusingRunnableEx2();
		
		Thread t1=new Thread(MultiThreadwithRunnable);
		Thread t2=new Thread(multithreadusingRunnableEx2);
		
		t1.start();
		t2.start();
*/	
	}

}
