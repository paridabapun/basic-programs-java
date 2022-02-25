package com.hsbc.withgeneric;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class DupArrayListRemoveTest {
	public static void main(String[] args) {

		ArrayList<UniqueEmployee> arrayList = new ArrayList<UniqueEmployee>();
		UniqueEmployee UniqueEmployee = new UniqueEmployee("1", 21300);
		UniqueEmployee UniqueEmployee1 = new UniqueEmployee("2", 21300);
		UniqueEmployee UniqueEmployee2 = new UniqueEmployee("3", 21300);
		UniqueEmployee UniqueEmployee3 = new UniqueEmployee("4", 21300);
		UniqueEmployee UniqueEmployee4 = new UniqueEmployee("5", 21300);
		UniqueEmployee UniqueEmployee5 = new UniqueEmployee("6", 21300);
		arrayList.add(UniqueEmployee);
		arrayList.add(UniqueEmployee1);
		arrayList.add(UniqueEmployee2);
		arrayList.add(UniqueEmployee3);
		arrayList.add(UniqueEmployee4);
		arrayList.add(UniqueEmployee5);
		ArrayList<UniqueEmployee> arrayList2 = new ArrayList<UniqueEmployee>();
		UniqueEmployee UniqueEmployee6 = new UniqueEmployee("7", 12300);
		UniqueEmployee UniqueEmployee7 = new UniqueEmployee("8", 12300);
		UniqueEmployee UniqueEmployee8 = new UniqueEmployee("9", 12300);
		UniqueEmployee UniqueEmployee9 = new UniqueEmployee("10", 12300);
		UniqueEmployee UniqueEmployee10 = new UniqueEmployee("11", 12300);
		UniqueEmployee UniqueEmployee11 = new UniqueEmployee("6", 92300);

		arrayList2.add(UniqueEmployee6);
		arrayList2.add(UniqueEmployee7);
		arrayList2.add(UniqueEmployee8);
		arrayList2.add(UniqueEmployee9);
		arrayList2.add(UniqueEmployee10);
		arrayList2.add(UniqueEmployee11);

		ArrayList<UniqueEmployee> arrayList3 = new ArrayList<UniqueEmployee>();

		for (UniqueEmployee e : arrayList) {
			for (UniqueEmployee e1 : arrayList2) {
				if (e.employee_ID.equals(e1.employee_ID)) {
					e1.salary = e1.salary + e.salary;
					e.salary = e1.salary;
					
				}
			}
		}


		arrayList3.addAll(arrayList2);
		arrayList3.addAll(arrayList);
		System.out.println(arrayList3);

	}
}
