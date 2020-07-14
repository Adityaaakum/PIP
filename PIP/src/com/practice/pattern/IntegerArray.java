package com.practice.pattern;

import java.util.ArrayList;

public class IntegerArray {

	
	public static void main(String[] args) {
		
		ArrayList<Integer>a= new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(10);
		Integer[]a1=(Integer[]) a.stream().toArray(Integer[]::new);

		for(int i:a1)
		{
			System.out.println(i);
		}
	}
}
