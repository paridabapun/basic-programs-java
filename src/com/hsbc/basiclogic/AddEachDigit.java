package com.hsbc.basiclogic;

import java.io.*;

public class AddEachDigit {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a no to add the digits");
		int n = Integer.parseInt(br.readLine());
		int r, s = 0;
		while (n > 0) {
			r = n % 10;
			s = s + r;
			n = n / 10;
		}
		System.out.println("The sum of the each digit is " + s);

	}

}
