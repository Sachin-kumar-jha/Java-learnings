package InterThreadCommunication;

public class Launch {

	public static void main(String[] args) {
		
		Message message=new Message();
		User u1=new User(message);
		User u2=new User(message);
		User u3=new User(message);
		
		u1.setName("raju");
		u2.setName("kaju");
		u3.setName("maju");
		
		u1.start();
		u2.start();
		u3.start();

	}

}
