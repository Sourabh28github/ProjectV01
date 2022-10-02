package com.Test;

public class Variable {
	 final int b=10;
	public static void m1() {
		int b=20;
		int c = 0;
		c=b;
		c++;
		System.out.println("the value is  "+c);
	}
	public static void main(String[] args) {
		
		Variable variable = new Variable();
		variable.m1();
		int d = variable.b;
		System.out.println("the value of variable b is "+d);
		
		
		
	
	
	
	
		
	}

}
