package com.hsbc.withoutgeneric;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class AllCursorEx {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		for (int i = 0; i < 10; i++) {
			v1.add(i);
		}
		System.out.println(v1);
		// using Enumeartion
		Enumeration<Integer> e = v1.elements();
		while (e.hasMoreElements()) {
			Integer i1 = e.nextElement();

			if (i1 % 2 == 0) {
				System.out.print(i1 + "\t");
			}
			System.out.println();

		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}

	}

}
