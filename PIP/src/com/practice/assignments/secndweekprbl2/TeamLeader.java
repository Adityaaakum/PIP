package com.practice.assignments.secndweekprbl2;

public class TeamLeader extends Programmer {
	
	String teamCollabrationMethods;
	String developmentMethods;
	
	
	
	public TeamLeader(String name, String email, String adress, String d, String programingLanguage,
			String teamCollabrationMethods, String developmentMethods) {
		super(name, email, adress, d, programingLanguage);
		this.teamCollabrationMethods = teamCollabrationMethods;
		this.developmentMethods = developmentMethods;
	}



	public void work()
	{
		System.out.println("You have to design system using "+this.ProgramingLanguage+"skills");
	}
	

}
