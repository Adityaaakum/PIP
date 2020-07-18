package com.practice.assignments.secndweekprbl2;

import java.util.Date;

public class Programmer extends Employee {
	
	String ProgramingLanguage;

	public Programmer(String name, String email, String adress, String d, String programingLanguage) {
		super(name, email, adress, d);
		ProgramingLanguage = programingLanguage;
	}
	
	
	public  void work()
	{
		System.out.println("Your work is to write code using "+ProgramingLanguage);
	}
	
	
	
	
	
	
	
	

}
