package com.practice.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort4 {
	
	public static void main(String[] args) {
		
		ArrayList<String>l= new ArrayList<String>();
		l.add("Adi");
		l.add("Prashnat");
		l.add("Urvashi");
		l.add("Shreya");
		System.out.println(l);
		List<String>l2= new ArrayList<String>();
		List<String>i=new ArrayList<String>();
		 i=l.stream().sorted().collect(Collectors.toList());
			System.out.println(i);
		
	}

}
