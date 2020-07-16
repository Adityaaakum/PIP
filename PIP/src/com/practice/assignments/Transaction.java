package com.practice.assignments;

import java.util.Scanner;

public class Transaction extends Loan {
	
	Scanner sc= new Scanner(System.in);
	public void depositAmount()
	{
		
		System.out.println("Enter amount you want to deposit");
		
		 long depos_amount=sc.nextLong();
		 this.depositAmount+=depos_amount;
		
		
	}
	
	      public void withDrawAmount()
	      {
	    	  
	    	  
	    	  System.out.println("Enter the amount you want to withdraw");
	    	  
	    	  long with_amnt=sc.nextLong();
	    	  
	    	  this.depositAmount=this.depositAmount-with_amnt;
	    	  
	    	  
	      }
	      
	    	public void payLoan()
	    	{
	    		System.out.println("Loan amount to customer?");
	    		this.Loan_Amount=sc.nextLong();
	      }
	    	
	    	
	    	public void showAccountDetails()
	    	{
	    		
	    		this.showDetails();
	    		
	    	}
	

}
