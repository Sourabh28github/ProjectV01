package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

//Program for generic type arraylist only

public class ArraylistDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("By using object of ArrayList class");
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		
		System.out.println("By using Iterator method");
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println("By using for each loop");

		for(int i : al) {
			
			System.out.println(i);
		}
		
	}

}
