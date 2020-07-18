package com.practice.assignments.secndweekprbl2;

import java.util.Date;

public abstract class Employee {

	
	String name;
	String email;
	String adress;
	String d; // we can use  SimpleDateFormat("dd/MM/yyyy").parse(sDate1) to convert string to date ,but for conveninece is used string
	public Employee(String name, String email, String adress, String d) {
		super();
		this.name = name;
		this.email = email;
		this.adress = adress;
		this.d = d;
	}
	 
	public abstract void work();
	
		
		
		
	
	
	
	
}
