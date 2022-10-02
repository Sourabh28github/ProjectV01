package com.Arrays;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFiles {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\SOURABH\\Desktop\\simple.properties");
			
			Properties p = new Properties();
			p.load(fis);
			
			String username=p.getProperty("username");
			String password = p.getProperty("password");
			
			System.out.println("username is>>"+username);
			System.out.println("password is >>"+password);
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
