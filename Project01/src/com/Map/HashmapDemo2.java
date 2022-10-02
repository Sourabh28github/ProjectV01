package com.Map;

//Program for to return map to method

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo2 {
	
	public HashMap<Integer, String>Employee(){ //we set Hashmap as a return type
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); //creating object of Hashmap with generics
		hm.put(101, "Sourabh");   //put entries in key and values
		hm.put(102, "Shiva");
		hm.put(103, "Shyam");
		return hm;	
	}
	
	public static void main(String[] args) {
		
		HashmapDemo2 obj = new HashmapDemo2();
		//first way to print 
		
		System.out.println("First way>>"+obj.Employee());
		
		HashMap<Integer, String> hm = obj.Employee();  // calling and passing method to hashmap object
		System.out.println("second way is>>"+hm);
		
		Map<Integer, String> map = obj.Employee();  //calling and passing method to map interface
		
		System.out.println("third way is >>"+map);
		
		
		
		
	}
	


}
