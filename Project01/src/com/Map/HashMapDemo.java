package com.Map;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(101, "Rahul");
		hm.put(102, "Rohit");
		hm.put(105, "Rishabh"); //sorts values based on the key
		hm.put(103,"Virat");
		hm.put(104, "Surya");
		
		System.out.println(hm);
		System.out.println(hm.size());
	}

}
