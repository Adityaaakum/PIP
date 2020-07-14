package com.practice.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort6 {
	
	public static void main(String[] args) {
		
		ArrayList<String>l= new ArrayList<String>();
		l.add("Adi");
		l.add("Prashnat");
		l.add("Urvashi");
		l.add("Shreya");
		System.out.println(l);
		List<String>l2= new ArrayList<String>();
		Comparator<String>s=(s1,s2)->{
		int l1=s1.length();
		int l11=s2.length();
		if(l1<l11)
			return-1;
		else if(l1>l11)
			return 1;
		else 
			return s1.compareTo(s2);
		
		};
		List<String>i=new ArrayList<String>();
		 i=l.stream().sorted().collect(Collectors.toList());
			System.out.println(i);
		
	}

}
