package com.hsbc.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToMap {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Bapun");
		arrayList.add("Bhavya");
		arrayList.add("Liza");

		System.out.println(arrayList);

		Map<Integer, String> map = new HashMap<Integer, String>();

		for (String string : arrayList) {

			map.put(arrayList.size(), string);
		}

		System.out.println(map);
	}

}
