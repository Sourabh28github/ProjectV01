package com.set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedsetDemo {
	
	public static void main(String[] args) {
		String[] name= {"Sourabh","Ram","Ajay","Vikas"};
		SortedSet<String> srt= new TreeSet(Arrays.asList(name));
		for(String n :srt) {
			System.out.println(n);
		}
		
		String first= srt.first();
		String last= srt.last();
		System.out.println(first);
		System.out.println(last);
	}

}
