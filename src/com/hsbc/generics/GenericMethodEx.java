package com.hsbc.generics;

public class GenericMethodEx {

	public static <E> void printArray(E[] inputArray) {

		for (E element : inputArray) {
			System.out.print(element);
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Integer[] inarr = { 12, 3, 4, 5, 6, 78 };
		String[] snarr = { "rama", "Hari", "Raju" };
		Double[] darr = { 12.2, 23.3, 45.4, 67.5, 88.7, 99.8 };
		Character[] carr={'a','e','i','o','u'};
		printArray(inarr);
		printArray(snarr);
		printArray(darr);
		printArray(carr);

	
	}

}
