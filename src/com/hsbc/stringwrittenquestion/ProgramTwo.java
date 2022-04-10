package com.hsbc.stringwrittenquestion;

//Reverse a String 

/*
Reverse each word’s characters but the position of word in string remain unchanged.
Example
Original string : how to do in java
Reversed string : woh ot od ni avaj 
*/

public class ProgramTwo {

	public static void main(String[] args) {

		String string = "how to do in java";

		String[] words = string.split("\\s");

		String revString = "";
		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);

			}
			revString = revString + reverseWord + " ";
		}
		System.out.println(revString);

	}
}
