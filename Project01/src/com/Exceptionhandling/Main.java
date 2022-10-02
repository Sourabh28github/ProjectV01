package com.Exceptionhandling;

public class Main {
	
	public static void main(String[] args) {
		try{
			int a =10/0;
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
			int b =10/5;
			System.out.println("value is 2");
		
	}

}
