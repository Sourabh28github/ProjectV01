package com.stringdemo;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1 = new String("sourabh");
		String s2 = new String("sourabh");
		
		s1=s2;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2); //checking location 
		System.out.println(s1.equals(s2)); //checking content
		
		
		
	}

}
