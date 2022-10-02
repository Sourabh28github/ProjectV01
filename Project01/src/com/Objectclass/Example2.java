package com.Objectclass;

public class Example2 implements Cloneable{
	int x;
	public static void main(String[] args) throws CloneNotSupportedException {
		Example2 example2 = new Example2();
		example2.x=50;
		
		System.out.println("First object data is  "+example2.x);
		Object example3= example2.clone();
		System.out.println("second object is  "+example3);
	}
	

}
