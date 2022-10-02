package com.Interface;

import java.util.Scanner;

public class Table {
	
	public void getTable(int no) {
		for(int i=1;i<=10;i++) {
			System.out.println(no+"*"+ i + "=" + (no*i));	
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a =sc.nextInt();
		
		Table obj = new Table();
		obj.getTable(a);
		
		
	
		
		
		
		
	

	
	
		
	}

}
