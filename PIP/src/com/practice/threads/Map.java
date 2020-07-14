package com.practice.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>l= new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(8);
		System.out.println(l);
		List<Integer>l2= new ArrayList<Integer>();
			l2=l.stream().map(i->i+5).collect(Collectors.toList());
			System.out.println(l2);
		
	}

}
