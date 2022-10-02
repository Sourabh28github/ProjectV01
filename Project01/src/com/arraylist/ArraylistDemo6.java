package com.arraylist;

import java.util.ArrayList;

public class ArraylistDemo6 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(40);
		al2.add(50);
		al2.add(60);
		ArrayList <Integer> a13 = new ArrayList<Integer>();
		a13.addAll(al);
		a13.addAll(al2);
		
		System.out.println(a13);
		
	}

}
