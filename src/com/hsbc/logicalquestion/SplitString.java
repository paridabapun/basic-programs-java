package com.hsbc.logicalquestion;

import java.util.Arrays;

public class SplitString {
	public static void main(String[] args) {

		String s1 = "My name@Bhagbata @PArida";
		String arr[] = s1.split("@");
		for (String s : arr) {
			System.out.print(s);
		}

		String line = "I am a java Developer";
//		String[] words = line.split(" ");
//		String[] twoWords = line.split(" 0", 2);
//		System.out.println(Arrays.toString(words) + "===============  " + Arrays.toString(twoWords));

	}
}
