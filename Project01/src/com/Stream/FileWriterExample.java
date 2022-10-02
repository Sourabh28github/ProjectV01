package com.Stream;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) {
		try {
			FileWriter obj = new FileWriter("C:\\Users\\SOURABH\\Desktop\\testout.txt");
			
			obj.write("Velovity training center Pune");
			obj.close();
		} catch (Exception e) {
			
			System.out.println("Success");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
