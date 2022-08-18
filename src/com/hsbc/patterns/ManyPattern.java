package com.hsbc.patterns;

public class ManyPattern {

	public static void main(String[] args) {

		pattern1(7);
	}

	public static void pattern1(int number) {

		for (int row = 1; row <= number; row++) {

			for (int col = 1; col <= number; col++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	public static void pattern2(int number) {
		/*
		 
		*
		**
		***
		****
		*****
		******
		*******
		
		**/

		for (int row = 1; row <= number; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
