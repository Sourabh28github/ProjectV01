package com.Constructorchaining;

public class Child1 extends Parent{
	
	Child1(){
		System.out.println("No-argumented constructor of child class");
	}
	
	Child1(String name){
		super(name);
		System.out.println("Calling parameterized constructor of child class");
		
	}
	
	public static void main(String[] args) {
		Child1 obj = new Child1();
		
	}
	
	

}
