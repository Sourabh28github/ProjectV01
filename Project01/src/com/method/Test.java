package com.method;

public class Test {
	
	public static Employee2 getEmployeeId() {
		int id =10;
		String name= "Sourabh";
		String city= "Kolhapur";
		return new Employee2(id,name,city);
		
	}
	public static void main(String[] args) {
		Employee2 emp = getEmployeeId();
		System.out.println(emp.id);
		System.out.println(emp.city);
		System.out.println(emp.name);
	}
		
		
}
