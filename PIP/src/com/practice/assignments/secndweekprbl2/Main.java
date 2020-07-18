package com.practice.assignments.secndweekprbl2;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		int role=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome ");
		
		System.out.println("Enter your name");
		String name= sc.next();
		
		System.out.println("Enter your email");
		String email= sc.next();
		
		System.out.println("Enter your address");
		String adress= sc.next();
		
		System.out.println("Enter your birthday");
		String bday= sc.next();
		
		System.out.println("Do you want to apply for company ?Y/N");
		char c=sc.next().charAt(0);
		 if(c=='Y')
		 {
			 
			 System.out.println("Which position do you want to apply?");
			 System.out.print("1) Programmer\n2) Tester\n3)Designer\n4)Buisness Developer\n5)TeamLeader\n6)Architect\n");
			 
			role = sc.nextInt();
			 
			 
			 
		 }
		 
		 else
			 System.out.println("Don't waste time here");
		
		 
		   switch (role) {
		case 1: System.out.println("Enter Programming language known");
		
		           String programLang=sc.next();
		           
		           Programmer p=new Programmer(name, email, adress, bday, programLang);
		           
		           new FactoryClass().returnEmployee(p);
		          			
			          break;
			
		case 2:     System.out.println("Enter testing methodologies known");
		   
		             String methdLogies= sc.next();
		             
		             Tester t= new Tester(name, email, adress, bday, methdLogies);
		             
		             new FactoryClass().returnEmployee(t);
		              break;
		              
		case 3:       System.out.println("enter design philosphy ");
		
		                 String phylosphy= sc.next();
		                 
		                 System.out.println("Enter design tools");
		                 
		                 String designTols= sc.next();
		                 
		                Designer d = new Designer(name, email, adress, bday, phylosphy, designTols)	;
		                
		                new FactoryClass().returnEmployee(d);
		                
		                break;
		                
		                
		                
		case 4:      System.out.println("Enter specialized domains");
		               
		              String domains = sc.next();
		              
		              
		              BuisnessDeveloper b = new BuisnessDeveloper(name, email, adress, bday, domains);
		              
		              new FactoryClass().returnEmployee(b);
                      
		              break;
		              
		case 5:        System.out.println("Kind of Collabration tools known?");
		                
		                    String collabTolls=sc.next();
		                    
		                  System.out.println("Enter type of development methods known");
		                  
		                  String devMethds= sc.next();
		                  
		                  System.out.println("Enter Programming Languages known");
		                  
		                  String progrmLang= sc.next();
		                  
		                  TeamLeader t1 = new TeamLeader(name, email, adress, bday, progrmLang, collabTolls, devMethds);
		                  
		                  new FactoryClass().returnEmployee(t1);
		                  
		                  break;
		default:
			
			System.exit(0);
	
		}
	}

}
