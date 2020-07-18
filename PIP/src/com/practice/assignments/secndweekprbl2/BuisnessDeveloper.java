package com.practice.assignments.secndweekprbl2;

public class BuisnessDeveloper extends Employee {
	
	String domains;

	public BuisnessDeveloper(String name, String email, String adress, String d, String domains) {
		super(name, email, adress, d);
		this.domains = domains;
	}
	
	public void work()
	{
		System.out.println("Collect requirment ,analyze requirment and write documents in "+this.domains+" domain");
		
		
	}

	
	
}
