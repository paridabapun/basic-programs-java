package com.hsbc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayToList {

	public static void main(String[] args) {

		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		List list1 = new ArrayList();
		List list = new ArrayList();

		for (int a : arr) {
			System.out.print(" " + a);
			list1.add(a);
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			list.add(arr[i]);
		}

		System.out.println(list1);
		System.out.println(list);

		// USING Arrays.asList()

		List list2 = Arrays.asList(arr);
		System.out.println(list2);

		List list3 = new ArrayList<>();
		System.out.println("Bhagabata");
		Collections.addAll(list3, arr);
		System.out.println(list3);

		List list4 = Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(list4);
		

	}
}
