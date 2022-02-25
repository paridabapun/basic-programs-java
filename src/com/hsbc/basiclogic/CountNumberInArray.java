package com.hsbc.basiclogic;

public class CountNumberInArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 3, 4, 5, 6, 7, 4, 5, 3, 6, 3, 54, 3, 5, 5, 6 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Count for the element " + arr[i] + " is  " + count);
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = ++count;
				}
			}

		}

	}
}
