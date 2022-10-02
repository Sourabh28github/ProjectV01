package Synchronization;

public class Account {
	
	private int balance=6000;
	
	public int getbalance() {
		return balance;
	}
	public int withDraw(int ammount) {
		
	 balance= balance-ammount;
	 return balance;
	}

}
