package com.practice.Streams;

import java.util.ArrayList;

public class Min {
	public static void main(String[] args) {
		ArrayList<Integer>i= new ArrayList<Integer>();
		i.add(1);
		i.add(5);
		i.add(0);
		i.add(19);
		i.add(3);
		int min=i.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		
	}

}
