package com.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLineByLineExample2 {
	
	
	public static void main(String[] args) {
		
		FileInputStream obj=null;
	    Scanner sc = null;
		
		try {
			 obj = new FileInputStream("C:\\Users\\SOURABH\\Desktop\\Demo.txt");
			 sc = new Scanner(obj);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
	}

}
