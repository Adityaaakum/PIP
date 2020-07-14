package com.practice.Streams;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class ForEach {
	public static void main(String[] args) {
		
		
		ArrayList<Integer>i= new ArrayList<Integer>();
		i.add(1);
		i.add(3);
		i.add(15);
		i.add(20);
		i.add(21);
		Consumer<Integer>ii=a->{
			System.out.println("The square of"+a+"is"+a*a);
		};
		i.stream().forEach(ii);
	}
	

}
