package com.DeadLockAndSolution;

public class Resource extends Thread{
	private String res1="res1";
	private String res2="res1";
	private String res3="res1";
	
	@Override
	
	public void run() {
		String name=Thread.currentThread().getName();
		if(name.equals("raju")) {
			rajuAccess(name);
		}else {
			kajuAccess(name);
		}
	}

	private void rajuAccess(String name) {
		/*
		synchronized(res1) {
			timeWait();
			System.out.println("res1 locked by"+" "+name);
		}
		synchronized(res2) {
			timeWait();
			System.out.println("res2 locked by"+" "+name);
		}
		synchronized(res3) {
			timeWait();
			System.out.println("res3 locked by"+" "+name);
		}
		
		*/
		synchronized(res1) {
//			timeWait();
			System.out.println("res1 locked by"+" "+name);
			synchronized(res2) {
//				timeWait();
				System.out.println("res2 locked by"+" "+name);
				synchronized(res3) {
//					timeWait();
					System.out.println("res3 locked by"+" "+name);
				}
			}

		}
	}
	
	private void kajuAccess(String name) {
		//Here giving object level access of thread using synchronized block
		/*synchronized(res1) {
			timeWait();
		
			System.out.println("res1 locked by"+" "+name);
		}
		synchronized(res2) {
			timeWait();
			System.out.println("res2 locked by"+" "+name);
		}
		synchronized(res3) {
			timeWait();
			System.out.println("res3 locked by"+" "+name);
		}
		//In this above code synchronization not performed bcz here random access possible.
		//For full synchronization we use nested synchronized block that is below. 
		
		
		Here when a thread using res1 it locked,then move res2 without quieting res1 and this process
		is going on when using res3 then the thread done their work and free all resources.
		So this way we achieve synchronization 
		But when we doing this type of synchronization other thread is using same resources then when the
		other thread uses resources randomly not in order then the execution is going infinite wait this condition 
		is called deadlock example given below.
		 */
		synchronized(res3) {
			timeWait();
			System.out.println("res3 locked by"+" "+name);
			synchronized(res1) {
				timeWait();
				System.out.println("res2 locked by"+" "+name);
				synchronized(res2) {
					timeWait();
					System.out.println("res1 locked by"+" "+name);
				}
			}

		}
				
	}

	private void timeWait() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	

}
