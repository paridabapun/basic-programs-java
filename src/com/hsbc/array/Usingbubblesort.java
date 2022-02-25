package com.hsbc.array;

import java.io.*;

public class Usingbubblesort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many Elements");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Int  ");
			arr[i] = Integer.parseInt(br.readLine());

		}

		// using bubble sort technique
		int limit = n - 1;
		boolean flag = false;
		int temp;
		for (int i = 0; i < limit; i++) {
			for (int j = 0; j < limit - 1; j++) {
				if (arr[i] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;

				}

			}
			if (flag == false)
				break;
			else
				flag = false;
		}
		System.out.println("The sorted arrayis : ");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}

}
