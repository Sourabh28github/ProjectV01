package com.set;


import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
        TreeSet ts = new TreeSet();
		
		ts.add("Sourabh");
		ts.add("Ruturaj");
		ts.add("Ashok");
		ts.add("Gautam");
	
		
		HashSet hs = new HashSet();
	    hs.add(10);
	    hs.add(20);
	    hs.add(40);
	    
	    System.out.println(hs);
	    hs.addAll(ts);
	    
	    System.out.println(hs);
	
	    
	
		
		
		
		
		
	}

}
