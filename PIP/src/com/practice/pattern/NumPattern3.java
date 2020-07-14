package com.practice.pattern;

public class NumPattern3 {

	
	public static void main(String[] args) {
		
		
		for(int i=1;i<=4;i++)
		{
			int k=0;
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j<=i)
				{
					System.out.print(++k+"");
					
				}
				else
				{
					System.out.print(--k+"");
				}
			}
			System.out.println();
		}
		
		
	}
	
}
