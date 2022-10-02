package com.vector;

import java.util.Vector;

public class Test {
	
	public static void main(String[] args) {
		
		Vector vc = new Vector();
		System.out.println(vc.capacity());
		
		for(int i=1;i<=10;i++) {
			vc.addElement(i);
		}
		
		System.out.println(vc.capacity());
		vc.addElement("j");
	    System.out.println(vc.capacity());
		System.out.println(vc);
		
	}

}

