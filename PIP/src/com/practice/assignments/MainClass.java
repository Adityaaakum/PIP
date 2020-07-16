package com.practice.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Transaction t = new Transaction();
			ArrayList<Account>hs= new ArrayList<Account>();
		
     	for(int i =0;i<10;i++)
		{
			
     		
			t.getDetails();
			t.getLoan();
			
			System.out.println("Do you want to deposit some amount? then enter 1  else enter 5 ");
			int depos= sc.nextInt();
			if(depos==1)
			{
				t.depositAmount();
			}
			System.out.println("Do you want to withdraw money from account?then enter 2 else enter 4");
			int withdraw=sc.nextInt();
			if(withdraw==2)
			{
				t.withDrawAmount();
			}
			 
			System.out.println("Want to get Loan? Enter 3 else enter 6");
			int Loan=sc.nextInt();
			if(Loan==3)
			{
				t.payLoan();
			}
			
			t.showAccountDetails();
			
			hs.add(t);
			
			
		}
     	System.out.println("All 10 customers data added");
		
		
	}

}
