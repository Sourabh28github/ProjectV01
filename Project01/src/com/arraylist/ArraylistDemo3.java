package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

//program to design 

public class ArraylistDemo3 {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Sourabh");
		al.add("Suyesh");
		al.add("Ruturaj");
		al.add("Rushi");
		
		System.out.println("BY using object of ArrayList class");
		System.out.println(al);
		
		Iterator<String> itr = al.iterator();
		System.out.println("By using Iterator method");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("By using for each loop");
		for(String str :al) {
			System.out.println(str);
		}
		
		
	}

}
