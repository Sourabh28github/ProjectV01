package com.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		
		int A1[]= {1,2,3,4,5};
		int A2[]= {4,5,2,3,6};
		
		for(int i=0;i<A1.length;i++) {
			for(int j=0;j<A2.length;j++) {
				if(A1[i]==A2[j]) {
					System.out.println(A1[i]);
				}
			}
		}
	}

}
