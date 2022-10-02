package com.multithreading;

public class Priorities extends Thread {
	public static void main(String[] args) {
	
	Priorities thread1 = new Priorities();
	Priorities thread2 = new Priorities();
	Priorities thread3 = new Priorities();
	thread1.setName("Sourabh");
	thread2.setName("Neha");
	thread3.setName("Ram");
	thread3.setPriority(MAX_PRIORITY);
	thread2.setPriority(MIN_PRIORITY);
	thread1.setPriority(NORM_PRIORITY);
	//System.out.println(thread3.currentThread());
	System.out.println(thread3.getName());
	System.out.println(thread2.getName());
	System.out.println(thread1.getName());
	System.out.println(thread3.getPriority());
	System.out.println(thread1.getPriority());
	}
	
	
	
	
	

}
