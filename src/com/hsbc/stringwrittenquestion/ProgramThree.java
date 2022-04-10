package com.hsbc.stringwrittenquestion;
/*
Reverse the string word by word but each word’s characters remain unchanged.
Example
Original string : how to do in java
Reversed string : java in do to how*/

public class ProgramThree {
	
	
	public static void main(String[] args) {
		
		String originalStr = "how to do in java" ;
		String words[] = originalStr.split("\\s");
		    String reversedString = "";
		 
		    //Reverse each word's position
		    for (int i = 0; i < words.length; i++) { 
		            if (i == words.length - 1) 
		              reversedString = words[i] + reversedString; 
		            else
		              reversedString = " " + words[i] + reversedString; 
		        } 
		 
		    // Displaying the string after reverse
		    System.out.print("Reversed string : " + reversedString);
		  }
	}

