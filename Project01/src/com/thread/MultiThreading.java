package com.thread;

public class MultiThreading extends Thread  {
	
	public void run() {
		for(int i = 1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.getMessage();
			}
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		MultiThreading thread1 = new MultiThreading();
		
		MultiThreading thread2 = new MultiThreading();
		
		thread1.start();
		thread2.start();
		
	}

}
