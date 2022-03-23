
package com.hsbc.oops;

public class TestString {

	public static void main(String[] args) {

		String abc = "abcde";
		System.out.println(abc.substring(1, 3));

		String string = "Kolkata".replace("K", "a");
		System.out.println(string);

		String string2 = "a1b2c3";
		String[] token = string2.split("\\d");

		for (String string3 : token) {
			System.out.print(string3);
		}

		String s = "what";
		StringBuffer sb = new StringBuffer("what");
		System.out.print(sb.equals(s) + "," + s.equals(sb));

	}
}
