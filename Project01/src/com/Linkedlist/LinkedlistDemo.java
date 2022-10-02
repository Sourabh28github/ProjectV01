package com.Linkedlist;

import java.util.LinkedList;

public class LinkedlistDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(60);
		l1.add(50);
		l1.addFirst(30);
		l1.addLast(70);
		l1.remove(1);
		l1.remove(2);
		
		System.out.println(l1);
		
		LinkedList ls = new LinkedList();
		ls.add(90);
		ls.add(80);
		ls.add("Sourabh");
		ls.add(120);
		
		ls.addAll(l1);
		System.out.println(ls);
		
	}

}
