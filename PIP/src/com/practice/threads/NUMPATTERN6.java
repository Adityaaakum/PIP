package com.practice.threads;

public class NUMPATTERN6 {

	
	public static void main(String[] args) {
		
		
		int count=0;
		int n;
		for(int i=1;i<=5;i++)
		{
		
			
				if(i%2!=0)
				{	for(int j=1;j<=3;j++)
				{
					
					System.out.print(++count);
				}
				}
				else
				{	n=count+1;
				for(int j=count+3;j>=n;j--)
				{
					count++;
	               System.out.print(j);			
				}
				}
				System.out.println();	
			}
		
			
		}
		
	}
	
	


