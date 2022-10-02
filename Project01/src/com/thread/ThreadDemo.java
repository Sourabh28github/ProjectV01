package com.thread;

public class ThreadDemo extends Thread implements Runnable {

	
	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		obj.run();
		Thread t = new Thread(obj);
		t.start();
	}

	@Override
	public void run() {
	     for (int i =1; i<=10;i++) {
	    	 System.out.println(i);
	    }
		
	}
	

}
