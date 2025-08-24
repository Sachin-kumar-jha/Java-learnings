package RaceCondition;

public class  Resource {

	// This method have object level lock of synchronization
	
	public synchronized void printer1(String name) {
	
		System.out.println("Printer1"+" "+ name);
	}
	
	public synchronized static void printer2(String name) {
		//Here we want whole method class level lock then we will declare with static and synchronized keyword.
		//This is class level lock of synchronization using global method synchronization
		System.out.println("Printer2"+" "+ name);	
	}
	
	public void printer3(String name) {
		synchronized(this) {   //Here we will object level lock of synchronization using synchronized block with passing current instance
			System.out.println("Printer3 object level synchronization"+name);
		}
	}
	
	public void printer4(String name) {
		synchronized(Resource.class) { 
			//Here if we want to give class level lock to the certain block of code then we use synchronized block and passing class.
			//Here we will implementing Class level lock of synchronization using synchronized block with passing class.
			System.out.println("Printer4 class leve synchronization"+name);
		}
	}
}
