package com.hsbc.logicalquestion;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		/*
		 * scanner.close(); String revString = new
		 * StringBuffer(inputString).reverse().toString(); if
		 * (inputString.equals(revString)) {
		 * System.out.println("Above String  is  Palindrome"); } else {
		 * System.out.println("Above String  is not  Palindrome "); }
		 */
		String reverse = "";
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverse = reverse + inputString.charAt(i);
		}
		if (inputString.equals(reverse)) {
			System.out.println("Above String  is  Palindrome");
		} else {
			System.out.println("Above String  is not  Palindrome ");
		}
	}
}
