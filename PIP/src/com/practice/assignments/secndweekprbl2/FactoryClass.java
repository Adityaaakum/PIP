package com.practice.assignments.secndweekprbl2;

public class FactoryClass {

	
	public void returnEmployee(Employee e)
	{
		
		
		if(e instanceof Programmer)
		{
			Programmer p=(Programmer) e;
			p.work();
		}
		else if(e instanceof Tester )
		{
			Tester t= (Tester)e;
			t.work();
		}
		else
			e.work();
		
		
		
		
		
	}
	
	
}
