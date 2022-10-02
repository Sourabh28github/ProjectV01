package com.Constructorchaining;

public class Parent {
	
	String name;
	
	Parent(String name){
		this.name=name;
		
		System.out.println("Calling parameterized constructor of parennt class");
	}
	
	Parent(){
		this("");
		System.out.println("No argumented constructor of parent class");
	}
	
	
   
	
}

