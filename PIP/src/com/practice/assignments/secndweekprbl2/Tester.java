package com.practice.assignments.secndweekprbl2;

import java.util.Date;

public class Tester extends Employee {
	
	
	String testingMethdl;

	public Tester(String name, String email, String adress, String d, String testingMethdl) {
		super(name, email, adress, d);
		this.testingMethdl = testingMethdl;
	}
	
	public void work()
	{
		
		System.out.println("Your job is to test and verify using "+testingMethdl);
		
	}
	
	
	

}
