package com.practice.Streams;

public enum FSNUM {
// Enum are used to store constants 
	
	LOW,
	MEDIUM,
	HIGH
}
 class enn
{
	 public static void main(String[] args) {
		FSNUM LEVEL= FSNUM.LOW;
		 System.out.println(LEVEL);
		 for (FSNUM level: FSNUM.values()) {
			 
			System.out.println(level);
		}
	}
	
}

