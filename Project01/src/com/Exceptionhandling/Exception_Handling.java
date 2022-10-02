package com.Exceptionhandling;

public class Exception_Handling {
	
	
	public static void main(String[] args) {
		System.out.println("My name is Sourabh");
		try {
		
		String str = null;
		System.out.println(str.length());
		//System.exit(0);
		
		}catch(NullPointerException e) {
		System.out.println(e);
		System.out.println("catch nullpointer exception");
		}finally {
			System.out.println("this first finally");
		}
		try {
			//System.exit(0);
			int a=10/0;	
		}catch(ArithmeticException e1) {
			System.out.println(e1);
			System.out.println("Catch arithmatic exception");
		}finally {
			System.out.println("This is my final code");
		}
		
		System.out.println("Hello everyone");
	}
		
	    
}
