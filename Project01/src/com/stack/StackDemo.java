package com.stack;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.add(10);
		st.add(20);
		st.add(30);
		
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.capacity());
		System.out.println(st.firstElement());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.search(20));
	
	}
	
	
	
	

}
