package com.hsbc.collection;

import java.util.ArrayList;
import java.util.List;

public class ListToArrays {

	public static void main(String[] args) {

		List list = new ArrayList<>();
		list.add("Bapun");
		list.add("Liza");
		list.add("Parida");

		Object[] arr = list.toArray();

		for (Object object : arr) {
			System.out.println(object);
		}

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(6);

		int arr1[] = list1.stream().mapToInt(i -> i).toArray();

		System.out.println("Started");

		for (int a : arr1) {
			System.out.println(a);
		}

	}

}
