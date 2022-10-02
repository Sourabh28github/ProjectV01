package com.method;

public class Employee {
	
	int id= 102;
	String name = "Sourabh";
	String Citynamme= "Kolhapur";
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Citynamme=" + Citynamme + "]";
	}



	public Employee getEmployeedetails() {
		
		Employee emp = new Employee();
		System.out.println(emp);
		return emp;

	}
	
	
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.getEmployeedetails();
	}
	
	

}
