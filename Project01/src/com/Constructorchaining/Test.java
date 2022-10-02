package com.Constructorchaining;

public class Test {
	
	Test(){
		this(5);
		System.out.println("this is default constructor");
		
	}
	
	Test(int b){
		this("Sourabh");
		System.out.println("this is parameterized constructor for int argument");
	}
	
	 Test(String str){
		
		 System.out.println("this is parameterized constructor for string argument");
	 }
	 
	 public static void main(String[] args) {
		
		 Test test = new Test();
	}

}
