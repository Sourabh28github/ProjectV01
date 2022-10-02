package com.arraylist;

import java.util.ArrayList;

public class ArralistDemo9 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(50);
		al.add(10);
		al.add("Ram");
		
		for(Object i:al) {
			
			System.out.println(i);
			
		}
		
	}

}
