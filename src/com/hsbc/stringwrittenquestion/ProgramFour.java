package com.hsbc.stringwrittenquestion;
/*
Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i*/

public class ProgramFour {
	
	
	public static void main(String[] args) {
		
		String originalStr = "i.like.this.program.very.much" ;
		String words[] = originalStr.split("\\.");
		    String reversedString = "";
		 
		    //Reverse each word's position
		    for (int i = 0; i < words.length; i++) { 
		            if (i == words.length - 1) 
		              reversedString = words[i] + reversedString; 
		            else
		              reversedString = "." + words[i] + reversedString; 
		        } 
		 
		    // Displaying the string after reverse
		    System.out.print("Reversed string : " + reversedString);
		  }
	}

