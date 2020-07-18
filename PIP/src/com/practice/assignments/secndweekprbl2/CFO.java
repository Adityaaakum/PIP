package com.practice.assignments.secndweekprbl2;

public class CFO extends Employee {
	
	
	String financeSkills;

	public CFO(String name, String email, String adress, String d, String financeSkills) {
		super(name, email, adress, d);
		this.financeSkills = financeSkills;
	}

	@Override
	public void work() {
		System.out.println("Your job is to manage finance");
		
		
		
	}
	
	

}
