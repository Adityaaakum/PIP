package com.practice.assignments.secndweekprbl2;

public class CTO extends Architect {
	
	String technologyDomain;
	
		      

    public CTO(String name, String email, String adress, String d, String programingLanguage, String designMethodology,
			String technologyDomain) {
		super(name, email, adress, d, programingLanguage, designMethodology);
		this.technologyDomain = technologyDomain;
	}
    
    
    public void work()
    {
    
    	System.out.println("Your work is to advice technology");
    }
    
    
    







	
	

}
