package com.practice.assignments;

import java.util.Scanner;

public class Loan extends Account {
	
	
	Long Loan_id;
	String Loan_type;
	Long Loan_Amount;
	Scanner sc= new Scanner(System.in);
	public void getLoan()
	{
		System.out.println("Enter Loan id");
		this.Loan_id= sc.nextLong();
		System.out.println("Enter Loan Type");
		this.Loan_type= sc.next();
		
	}
	
	public void showLoanDetails()
	{
		System.out.println("Loan id= "+Loan_id);
		System.out.println("Loan type= "+Loan_type);
		System.out.println("Loan Amount= "+Loan_Amount);
	}
	

}
