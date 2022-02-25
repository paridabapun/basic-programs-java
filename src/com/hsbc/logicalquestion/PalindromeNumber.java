package com.hsbc.logicalquestion;

import java.util.Scanner;

class PalindromeNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();
		scanner.close();
		int rem, sum = 0, temp;
		temp = inputNumber;
		while (inputNumber > 0) {
			rem = inputNumber % 10;
			sum = (sum * 10) + rem;
			inputNumber = inputNumber / 10;
		}
		if (temp == sum)
			System.out.println(temp + " is palindrome ");
		else
			System.out.println(temp + " is not a palindrome ");

	}
}
