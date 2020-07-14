package com.practice.threads;

import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUsingArrays {

	
	public static void main(String[] args) {
		
		Stream s= Stream.of(9,99,999,399);
		s.forEach(System.out::println);
		
		int [] ar= {10,20,30,40};
		Stream.of(ar).forEach(System.out::println);
	
	Random r = new Random();
		r.ints().limit(10).forEach(System.out::println);
}
}
