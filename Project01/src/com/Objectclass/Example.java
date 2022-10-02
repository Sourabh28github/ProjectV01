package com.Objectclass;

public class Example {
	
	int x;
	
	public String tostring() {
		return "Example[x = "+x+"]";
	}
	
	public static void main(String[] args) {
		Example example = new Example();
		example.x=50;
		System.out.println("First object data is  "+example);
	
		
	}

}
