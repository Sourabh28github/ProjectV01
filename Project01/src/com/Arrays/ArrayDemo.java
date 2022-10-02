package com.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
//		int x = a[0];
//		int y = a[1];
//		int z= a[2];
//		int m=a[3];
//		int n=a[4];
		
		//System.out.println(a[1]+a[2]+a[3]+a[4]);
		
		
		for(int i=0; i<a.length-1;i++) {
			System.out.println(a[i]);
		}
	}

}
