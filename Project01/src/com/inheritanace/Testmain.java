package com.inheritanace;

public class Testmain {
	public static void main(String[] args) {
		//scenario-1
		//X x = new X();
		//System.out.println(x.a);
		//System.out.println(x.b);
		//System.out.println(x.c);//this is variable from child classs
		//x.m1();
		//x.m2();
		//x.m3();//this is method from child class
		
		//scenario-2
		
//		 Y y = new Y(); 
//		 System.out.println(y.a);//because we extend class X to the Y
//		 System.out.println(y.b); 
//		 
//		 y.m1();//method from class x
//	     y.m2();//method from class Y 
//		 y.m3();//method from class Y
		 
		//scenario-3
		
		//X x =new Y();  Dynamic dispatch
		//System.out.println(x.a);
		//System.out.println(x.b);
		//System.out.println(x.c); //this belongs to child class Y
		//x.m1();
		//x.m2();
		//x.m3();	//this method from child class so it will not going to executed	
		
		
		//scenario- 4
//		X x = new X();
//		Y y = new Y();
//		x=y;
//		System.out.println(x.a);
//		System.out.println(x.b);
//		//sysem.out.println(x.c);
//		x.m1();
//		x.m2();
//		x.m3();
		
		//scenario-5
		
		  X x= new Y();
		  Y y = new Y();
		  
		  y =(Y)x; //type casting 
		  System.out.println(y.a); 
		  System.out.println(y.b);
		 // system.out.println(y.c); 
		  y.m1(); 
		  y.m2(); 
		  y.m3();
		 
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		}

}
