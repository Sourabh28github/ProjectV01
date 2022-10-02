package com.Objectclass;

public class Employee {
	//int empId;
	String empName;
	
	public static void main(String[] args) {
		Employee s1 = new Employee();
		//s1.empId=1;
		s1.empName= "Sourabh";
		
		Employee s2= new Employee();
		//s2.empId=2;
		s2.empName="Sourabh";
		//emp1 = emp2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
