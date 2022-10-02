package com.arraylist;

//Program for coping one arraylist to another arraylist

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(50);
		al2.add(60);
		al2.add(70);
		al2.add(80);
		
		al.addAll(al2);
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
