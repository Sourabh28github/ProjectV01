package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MobileNumber {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		for(int i =1;i<=5;i++) {
			System.out.println("Enter the 5 mobile number");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();	
			list.add(str);
			}
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
