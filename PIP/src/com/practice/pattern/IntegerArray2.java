package com.practice.pattern;

import java.util.ArrayList;
import java.util.stream.Stream;

public class IntegerArray2 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer>a= new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(10);
		Integer[]a1=(Integer[]) a.stream().toArray(Integer[]::new);
        Stream.of(a1).forEach(System.out::println);
	/*	for(int i:a1)instead foradvanced i use forEach which is accesible only using streams so we need to convert array to stream again
		{
			System.out.println(i);
		}*/
	}
}
