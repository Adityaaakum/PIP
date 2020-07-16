package com.practice.assignments;

import java.util.Scanner;

public class Account {
	
	
	
	String accound_id;
	String account_name;
	String adress;
	long depositAmount;
	Scanner sc = new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter account id");
		this.accound_id=sc.next();
		System.out.println("Enter account name");
		this.account_name=sc.next();
		System.out.println("Enter adress ");
		this.adress=sc.next();
		System.out.println("Enter amount to be deposited");
		this.depositAmount=sc.nextLong();
	}
	
	public void showDetails()
	{
		System.out.println("Account id is "+accound_id);
		System.out.println("Account name is "+account_name);
		System.out.println("adress is "+adress);
		System.out.println("Amount deposited= "+depositAmount);
		
	}
	

}
