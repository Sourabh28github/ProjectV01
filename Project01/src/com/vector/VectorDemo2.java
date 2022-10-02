package com.vector;

import java.util.Vector;

public class VectorDemo2 {
	
	public static void main(String[] args) {
		
		Vector<String> vc = new Vector();
		
		vc.add("Sourabh");
		vc.add("Shiva");
		vc.add("Sushant");
		vc.add("Ashitosh");
		vc.add("Akshay");
		
		while(vc.contains("sushant")) {
			vc.remove("sushant");
		}
		System.out.println("New vector is>> "+vc);
		
		System.out.println("vector size is>>"+vc.size());
		
		System.out.println("vector capacity>>"+vc.capacity());
		
		System.out.println("index>> "+vc.get(2));
		
	}

}
