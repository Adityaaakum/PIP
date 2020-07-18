package com.practice.assignments.secndweekprbl2;

public class Architect extends Programmer {
	
	
	String designMethodology;

	public Architect(String name, String email, String adress, String d, String programingLanguage,
			String designMethodology) {
		super(name, email, adress, d, programingLanguage);
		this.designMethodology = designMethodology;
	}
	
	public void work()
	{
		
		System.out.println("You are a programmer who has to design system using "+this.designMethodology);
		
	}
	

}
