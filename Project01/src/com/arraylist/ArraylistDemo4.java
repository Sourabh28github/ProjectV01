package com.arraylist;

import java.util.ArrayList;

//Program for demonstrate the arraylist method

public class ArraylistDemo4 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10); //at 0th index
		al.add(20); //at 1st index
		al.add(50); //at 2nd index
		al.add(2,75);
		
		System.out.println("size of list is "+al.size());
		System.out.println("List "+al);
		System.out.println(al.contains(80));
		
	}

}
