package RaceCondition;

public class Card extends Thread{
private Account account;

public Card(Account account) {
	this.account=account;
}
	@Override
	public void run() {
		for(int i=0;i<100000;i++) {
			//account.duduct(2,Thread.currentThread().getName());
			account.change(Thread.currentThread().getName());
		}
	}
	
}
