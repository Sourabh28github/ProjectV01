package com.arraylist;

import java.util.ArrayList;

public class ArraylistDemo {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(50);
		al.add("Ram");
		al.add(null);
		al.add(25);
		al.add(75);
		al.remove(1);
		try {
		al.replaceAll(null);
		}catch(NullPointerException e) {
			e.getMessage();
			System.out.println(e);
		}
		System.out.println(al);
		
	}
	
	
	

}
