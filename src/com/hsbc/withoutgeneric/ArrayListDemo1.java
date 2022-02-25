package com.hsbc.withoutgeneric;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo1 {
	static ArrayList<Object> a1;
	public static void main(String[] args) {
		a1 = new ArrayList<Object>(78);
		List<Object> l1 = Collections.synchronizedList(a1);
		System.out.println(a1.hashCode());// 1
		System.out.println(l1.hashCode());// 1
		System.out.println(a1.toString());//
		a1.add("Rama");
		a1.add(123);
		a1.add("hari");
		a1.add(288);
		a1.add("BHAGA");
		a1.add("Rama");
		a1.add(123);
		a1.add("hari");
		a1.add(288);
		a1.add("BHAGA");
		a1.add(null);
		a1.add("Chuhu");
		a1.add(288);
		a1.add("BHAGA");
		a1.add(null);
		a1.add("Chuhu");
		System.out.println(a1);
		a1.remove(2);
		System.out.println("After modification" + "\n" + a1);
		System.out.println(a1);
		Integer s1 = (Integer) a1.get(1);
		System.out.println(s1);
		a1.add(1, "Hari");
		a1.addAll(a1);
		a1.addAll(2, a1);
		System.out.println(a1);

		System.out.println("Size :" + a1.size());
		System.out.println(a1.lastIndexOf(a1));
		System.out.println(a1.isEmpty());
		System.out.println(a1.hashCode());
		System.out.println(a1.contains("Rama"));
		System.out.println(a1 instanceof Serializable);
		System.out.println(a1 instanceof Cloneable);
		System.out.println(a1 instanceof RandomAccess);
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.get(2));

		System.out.println("Final list after all operation " + "\n" + a1);

		// Iterating all elements using iterator
		System.out.println("// Iterating all elements using iterator");
		Iterator iterator=a1.iterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		
		//Iterating through for each
		System.out.println("//Iterating through for each");
		for(Object o: a1) {
			System.out.println(o);
			
		}

	
	}
}
