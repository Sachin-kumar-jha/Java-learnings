package RaceCondition;
/*
 This is the example code of there racecondition occurs.
 For solution here we use Synchronization.
 
 Synchronization?
 
 If a thread T is using a resource R, at that point of time no other thread
 can access the same resource until the Thread T completed its execution.
 
 */
public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
//		Account account=new Account();
//		
//		Card card1=new Card(account);
//		Card card2=new Card(account);
//		
//		card1.setName("CARD1");
//		card2.setName("CARD2");
//		
//		card1.start();
//		card2.start();
//		
//		card1.join();
//		card2.join();
//		
//		account.getACount();
//		//account.getString();
		
		Resource resource1=new Resource();
		Resource resource2=new Resource();
		
		customScope User1=new customScope(resource1);
		customScope User2=new customScope(resource2);
		
		User1.setName("User1");
		User2.setName("User2");
		
		User1.start();
		User2.start();
		
//		User1.join();
//		User2.join();
		
		
		
		
	}

}
