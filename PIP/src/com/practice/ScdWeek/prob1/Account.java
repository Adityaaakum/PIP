package com.practice.ScdWeek.prob1;

public class Account {
	
	
	double salary;
	public Account(double salary) {
		super();
		this.salary = salary;
	}
	public void manageMoney()
	{
		
		System.out.println("Hi as your salary is "+this.salary+"  Here how you should manage money: ");
		System.out.println("NEC:"+(.55*this.salary));
		System.out.println("FEA:"+(.10*this.salary));
		System.out.println("EDU:"+(.10*this.salary));
		System.out.println("LTSS:"+(.10*this.salary));
		System.out.println("NEC:"+(.10*this.salary));
		System.out.println("NEC:"+(.05*this.salary));
		
		
		
		
	}
	
	

}
