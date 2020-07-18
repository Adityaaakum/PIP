package com.practice.assignments.secndweekprbl2;

public class Designer extends Employee {
	
	
	String designPhilospy;
	String designTools;
	public Designer(String name, String email, String adress, String d, String designPhilospy, String designTools) {
		super(name, email, adress, d);
		this.designPhilospy = designPhilospy;
		this.designTools = designTools;
	}
    
	
	public void work()
	{
		System.out.println("You have to design using "+this.designPhilospy+" philospy and using "+this.designTools  );
		
	}

}
