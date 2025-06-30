package com.DeadLockAndSolution;

public class Launch {

	public static void main(String[] args) {
		Resource resource1=new Resource();
		Resource resource2=new Resource();
		
		resource1.setName("raju");
		resource2.setName("kaju");
		
		
		
		resource1.start();
		resource2.start();
	}

}
