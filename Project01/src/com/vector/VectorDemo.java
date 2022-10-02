package com.vector;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		for(int i=1;i<=10;i++) {
			v.addElement(i);
		}
		
		System.out.println(v.capacity());
		v.addElement(30);
		
		System.out.println(v.capacity());
			
	}

}
