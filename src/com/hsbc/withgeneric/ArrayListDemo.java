package com.hsbc.withgeneric;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();// Bhagabata,Tapu,Akansksha,Bhagabata,Tapu,Akansksha,
		System.out.println(list.size());
		list.add("Bapun");
		list.add("Tapu");
		list.add("Akanksha");
		System.out.println(list.size());
		list.add("Bapun");
		list.add("Tapu");
		list.add("Akanksha");
		System.out.println(list.size());
		System.out.println(list);
		list.remove(1);
		System.out.println(list);

		ListIterator<String> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			String element = listIterator.next();
			System.out.println(element);
		}
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
