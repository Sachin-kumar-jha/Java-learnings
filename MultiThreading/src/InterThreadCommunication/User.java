package InterThreadCommunication;

public class User extends Thread {
	
	private Message message;
	
	

	public User(Message message) {
		this.message = message;
	}



	@Override
	public void run() {
		String name=getName();
		
		if(name.equals("raju") || name.equals("kaju")) {
			int i=0;
			while(i<5) {	
				message.sendMessage(" GOOD MORNING "+i,name);
				i++;
			}
			
		}else {
			int i=0;
			while(i<10) {
				System.out.print("read "+i);
				message.readMessage(name);
				i++;
			}
			
		}
	}
}
