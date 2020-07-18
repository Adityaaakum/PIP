package com.practice.assignments.prctprblm5;

import java.util.Scanner;

public class STRINGMANPL {
	
	
	public static String capitalizeWord(String str){  
	    String words[]=str.split(" ");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();
	

}
	public static String SentanceCase(String str){  
	    String words[]=str.split("\\.");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();
}
	
	//Assuming invert is first letter of each sentence is lower and rest upper i am writing code 
	
	public static String Invert(String str){  
	    String words[]=str.split("\\.");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	    return capitalizeWord.trim();
	
	}
	
	
	
	         public static void main(String[] args) {
				
	        	 
	        	 
	        	 Scanner sc = new Scanner(System.in);
	        	 
	        	 System.out.println("Please enter string");
	        	 
	        	 String enterString= sc.nextLine();
	        	 
	        	 System.out.println("All upper case: "+enterString.toUpperCase());
	        	 
	        	 System.out.println("All lower case :" +enterString.toLowerCase());
	        	 
	        	 System.out.println("Capitalize case : "+STRINGMANPL.capitalizeWord(enterString));
	        	 
	        	 System.out.println("Sentance case :"+STRINGMANPL.SentanceCase(enterString));
	        	 
	        	 System.out.println("Inver case : "+STRINGMANPL.Invert(enterString));
	        	 
	        	 
	        	 System.out.println("-----------------------------------------------");
	        	 
	        	 
	        	 
	        	 
			}
	
	
}