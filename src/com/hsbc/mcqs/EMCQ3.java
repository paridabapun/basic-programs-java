package com.hsbc.mcqs;

public class EMCQ3 {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		try {
			int c = a / b;
			System.out.println(c);

		} catch (Exception exception) {
			System.out.println("Exception Caught");
			/*
			 * } catch (ArithmeticException exception) {
			 * System.out.println("Exception Caught"); }
			 */ // SHOULD be a unreachable block
		}
	}
}
