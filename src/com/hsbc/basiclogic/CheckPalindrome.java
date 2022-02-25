package com.hsbc.basiclogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any Number");
		try {
			String number = br.readLine();
			int temp = Integer.parseInt(number);
			int num = temp;
			int sum = 0, r = 0;
			while (num > 0) {
				r = num % 10;
				sum = (sum * 10) + r;
				num = num / 10;
			}
			if (temp == sum) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not Palindrome");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}
}