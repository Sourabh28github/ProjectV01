package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {
	
	public ArrayList getEmployeeData() {
		
		ArrayList arraylist = new ArrayList();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		return arraylist;
		
	}
	
	public static void main(String[] args) {
		EmployeeList list = new EmployeeList();
		ArrayList obj = list.getEmployeeData();
		
		System.out.println(obj);
		
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
