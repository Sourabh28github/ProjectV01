package Synchronization;

public class AccountDetails implements Runnable {
	Account account = new Account();

	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			makeWithdrawal(600);
			
		}
	}
		private synchronized void makeWithdrawal(int amt) {
			if(account.getbalance()>=amt) {
				System.out.println(Thread.currentThread().getName()+ "  is going to withdraw=>>");
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
				int bal = account.withDraw(amt);
				System.out.println(Thread.currentThread().getName()+"  complete the withdraw=>"+bal);
			}else {
				System.out.println("Insufficient balance");
			}
		
	
		
	}
	

}
