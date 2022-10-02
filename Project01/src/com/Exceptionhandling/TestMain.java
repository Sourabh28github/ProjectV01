package com.Exceptionhandling;

public class TestMain {
	
	public static void main(String[] args)  {
		Account obj = new Account();
		System.out.println("current balance : "+obj.balance());
		try {
			obj.withdraw(3500);
		} catch (Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("current balance : "+obj.balance());
	}

}
