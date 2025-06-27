package MultiThreadingUsingRunnableinterface;

public class multithreadusingRunnableEx2 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 String name=Thread.currentThread().getName();
		 System.out.println(name+"five");
		 for(int i=1;i<=10;i++) {
			 System.out.println("Seven"+":"+7*i);
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
