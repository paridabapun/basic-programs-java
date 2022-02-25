package com.hsbc.logicalquestion;

public class NumberPalindrome {

	public static String palindrmNumber(int inputNum) {
		int temp = inputNum;
		int rem = 0, sum = 0;
		while (inputNum > 0) {
			rem = inputNum % 10;
			sum = (sum * 10) + rem;
			inputNum = inputNum / 10;

		}
		if (sum == inputNum) {
			return "Palindrome";
		}

		return "Not Palindrome";

	}

	public static void main(String[] args) {

		String statusOfNum = palindrmNumber(123);
		System.out.println(statusOfNum);

	}
}
