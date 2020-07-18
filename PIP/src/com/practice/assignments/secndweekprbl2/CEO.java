package com.practice.assignments.secndweekprbl2;

public class CEO extends Employee {
	
	String vision;
	String mission;
	public CEO(String name, String email, String adress, String d, String vision, String mission) {
		super(name, email, adress, d);
		this.vision = vision;
		this.mission = mission;
	}
	@Override
	public void work() {
		System.out.println("Your job is to manage comapny!Congrats");
		
	}

	
	
	
}
