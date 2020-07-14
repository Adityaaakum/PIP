package com.practice.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort5 {
	
	public static void main(String[] args) {
		
		ArrayList<String>l= new ArrayList<String>();
		l.add("Adi");
		l.add("Prashnat");
		l.add("Urvashi");
		l.add("Shreya");
		System.out.println(l);
		List<String>l2= new ArrayList<String>();
		List<String>i=new ArrayList<String>();
		 i=l.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
			System.out.println(i);
		
	}

}
