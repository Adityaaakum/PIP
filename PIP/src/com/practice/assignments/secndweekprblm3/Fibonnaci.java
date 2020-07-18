package com.practice.assignments.secndweekprblm3;

import java.util.Scanner;

public class Fibonnaci {
	
	
	  static void printFibonacciNumbers(int n) 
	    { 
	        int f1 = 0, f2 = 1, i; 
	      
	        if (n < 1) 
	            return; 
	      
	        for (i = 1; f2<=n; i++) 
	        { 
	            System.out.print(f2+" "); 
	            int next = f1 + f2; 
	            f1 = f2; 
	            f2 = next; 
	        } 
	        
	        
	        

}                 
	  public static void main(String[] args) {
		
		  
		  
		  
		  Scanner sc= new Scanner(System.in);
		  
		  System.out.println("Enter the number please");
		  
		  Fibonnaci.printFibonacciNumbers(sc.nextInt());
		  
		  
		  
		  
	}
	    
	    
}
