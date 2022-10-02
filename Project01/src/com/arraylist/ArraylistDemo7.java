package com.arraylist;

import java.util.*;



public class ArraylistDemo7 {
	
	public static void main(String[] args) {
		
		ArrayList <Employee> al = new ArrayList<Employee>();
		
		Employee emp = new Employee(101, "Sourabh", 15000);
		al.add(emp);
		al.add(new Employee(102, "Sahil", 20000));
		al.add(new Employee(103, "somesh", 30000));
		
		
		Iterator<Employee> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Employee i : al) {
			System.out.println(i);
		}
		
	}

}
