package com.inheritanace;

public class Method1 {
	public int test(int num) {
		int c=1;
		for(int i=1;i<=num; i++) {
			 c= c*i;
			 
		}
		return c;
	}
	
	public static void main(String[] args) {
		
		Method1 obj = new Method1();
		int x=obj.test(10);
		System.out.println(+x);
		
		
	}

}
