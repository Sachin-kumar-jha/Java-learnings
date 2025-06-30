package InterThreadCommunication;
public class Message {

	private String message;
	private boolean messageSent; //default false
	
	public synchronized void sendMessage(String message,String name) {
		System.out.println("called "+name);
		while(messageSent==true) {
			System.out.println("Enter "+name+" while");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.message=message;
		System.out.println(message+" sent by "+ name);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		messageSent=true;
		notifyAll();
	}
	
	/*
	 Here two sender and one receiver present so here when a sender send message then its
	 the flag is true and  and sender notify receiver and then receiver read message and notify();
	 but here two receiver here receiver set flag value false  so here other any one sender active.
	 But when sender notify sender then the value of flag is true and if value true then it goes in wait state
	 and this way all thread are in wait state so the thread waiting infinitely this called dead lock .
	 For this solution we use notifyAll() so the notifyAll active all wait state thread so the receiver receive message 
	 and set flag false and notify sender. 
	 */
	
	public synchronized void readMessage(String name) {
		System.out.println("called "+name);
		while(messageSent==false) {
			System.out.println("Enter "+name+" while");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(message +" read by "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		messageSent=false;
		notifyAll();
	}
}
