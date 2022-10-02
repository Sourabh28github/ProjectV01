package com.Objectclass;

public class X {
	
	String name;
	public static void main(String[] args) {
		
		X obj = new X();
		obj.name= "raj";
		
		X obj2 = new X();
		
		obj2.name="raj";
		
		System.out.println(obj==obj2);
		System.out.println(obj.equals(obj2));
		
	}

}
