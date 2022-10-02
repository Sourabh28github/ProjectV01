package com.arraylist;

//Program for sorting arraylist

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo5 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Kolhapur");
		al.add("Pune");
		al.add("Nagpur");
		al.add("Mumbai");
		al.add("Benglore");
		al.add("Kolkatta");
		al.add("Aurangabad");
		al.add("Chennai");
		System.out.println("before sorting list");
		System.out.println(al);
		System.out.println("After sorting list");
		Collections.sort(al);
		System.out.println(al);
		
	}

}
