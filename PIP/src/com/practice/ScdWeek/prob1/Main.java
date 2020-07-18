package com.practice.ScdWeek.prob1;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary");
		double sal= sc.nextDouble();
		Account ac= new Account(sal);
		ac.manageMoney();
		
	}
	
	
}
