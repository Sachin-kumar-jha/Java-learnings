package RaceCondition;

public class Account {
	
	private double amount=500000;
	private int change=0;
	//Here this is string is immutable string and this store in constant pool.
	//private String xyz="pqr";
	StringBuffer xyz =new StringBuffer("pqr");
	//Here we create once xyz object and uses many times for change.
	
	//We use Synchronized keyword to prevent race condition
	public synchronized void duduct(int value,String name) {
		this.amount=this.amount-value;
		System.out.println("amount deducted by"+name);
	}
	
	public void change(String name) {
		//Here when we concating string this is stored in non constant pool and every 
		//request here new object created again and again .
		//for optimization here we use mutable string eg:StringBuffer in this here all method of mutation is already synchronized
		//so here no need to make change method synchronize because here not overlapping two thread changes
		xyz=xyz.append("a");
		synchronized(this) {
			
			//here passing this keyword bcz it point to account object 
			//So here when a thread enter this synchronized block this Account is locked for only this thread no other thread mutate at that time
			//so here Race condition is solved by synchronized block.
			//This block code called critical code
			 change++;
		}
      
		
		System.out.println("a added by"+name);
	}
	public void get() {
		System.out.println(amount);
	}
 
	public void getACount() {
		
		int count=0;
		for(char c:xyz.toString().toCharArray()) {
			if(c=='a') {
				count++;
			}
		}
		
		System.out.println("a count"+" "+count);
		System.out.println("Change call count"+" "+ change);
	}
	
	public void getString() {
		System.out.println(xyz);
	}
}
