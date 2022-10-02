package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo8 {
	
	public List<Employee>getEmployeeList(){
		ArrayList<Employee> al = new ArrayList<Employee>();
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(104, "Ajay", 25000));
		list.add(new Employee(105,"Ram", 30000) );
		return list;
		
	}
	
	public static void main(String[] args) {
		ArraylistDemo8 al = new ArraylistDemo8();
		List<Employee> sc = al.getEmployeeList();
		
		System.out.println(sc);
		
		Iterator<Employee> itr = sc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Employee emp : sc) {
			System.out.println(emp);
		}
		
		
		
		
		
		
	}

}
