package com.practice.threads;

public class NUMPATTERN5 {

	
	
	public static void main(String[] args) {
		
		int result=0;
		
		for(int i=1;i<=5;i++)
		{ int m=i;
			
			for( int j=1;j<=i;j++)
			{
	         
	         
	        	 
	        	 System.out.print(m+" ");
	        	 m=m+5-j;
	         
	         
	         }
			System.out.println();
		}
		
	}
}
