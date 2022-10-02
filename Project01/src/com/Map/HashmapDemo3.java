package com.Map;

import java.util.HashMap;

public class HashmapDemo3 {
	
	public static void main(String[] args) {
		
		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		Employee employee = new Employee();
		
		hm.put(employee, employee.getName());
		//hm.put(employee, employee.getSalary());
		//hm.put(employee, employee.getId());
		
		System.out.println(hm.get(employee));
		
		
		
	}

}
