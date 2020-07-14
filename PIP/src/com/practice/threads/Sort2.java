package com.practice.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>l= new ArrayList<Integer>();
		l.add(31);
		l.add(39);
		l.add(45);
		l.add(80);
		System.out.println(l);
		List<Integer>l2= new ArrayList<Integer>();
			int Failedstudents=(int)l.stream().filter(i->i<35).count();
			System.out.println(Failedstudents);
		
	}

}
