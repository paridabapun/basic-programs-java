package com.hsbc.stringwrittenquestion;

//Reverse a String
public class ProgramOne {

	String string = "i.like.this.program.very.much";

	// Function to reverse words in a given string.
	public static String reverseWords(String s) {
		// code here
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}

		return rev;
	}

	public static void main(String[] args) {

		String string = reverseWords("i.like.this.program.very.much");
		System.out.println(string);
	}

}
