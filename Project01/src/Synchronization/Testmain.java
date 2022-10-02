package Synchronization;

public class Testmain {
	
	public static void main(String[] args) {
		
		AccountDetails obj = new AccountDetails();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("Sourabh");
		t2.setName("Shreeram");
		t1.start();
		t2.start();
	}

}
