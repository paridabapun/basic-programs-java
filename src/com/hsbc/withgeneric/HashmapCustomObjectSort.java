package com.hsbc.withgeneric;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Employee1 implements Comparable<Employee1> {
	private int eid;
	private String ename;

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	Employee1(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	public String toString() {
		return eid + "==" + ename;
	}

	public int hashCode() {
		return eid;
	}

	public boolean equals(Object obj) {
		Employee1 e1 = (Employee1) obj;
		if (this.ename.equals(e1.ename)) {
			return true;
		}
		return false;
	}

	public int compareTo(Employee1 o1) {
		if (eid > o1.eid)
			return 1;
		else if (eid < o1.eid)
			return -1;
		else
			return 0;
	}
}

public class HashmapCustomObjectSort {
	public static void main(String[] args) {
		HashMap<Employee1, Integer> hm = new HashMap<Employee1, Integer>();
		hm.put(new Employee1(100, "x"), 5000);
		hm.put(new Employee1(50, "y"), 2000);
		hm.put(new Employee1(510, "p"), 3000);
		hm.put(new Employee1(230, "d"), 7000);
		hm.put(new Employee1(230, "g"), 7000);
		hm.put(new Employee1(230, "w"), 7000);
		hm.put(new Employee1(230, "b"), 2000);
		hm.put(new Employee1(230, "a"), 4000);
		System.out.println(hm);

		// Using another Map which will containg sorted entries. and Comparable
		List<Employee1> entrylist = new ArrayList<Employee1>(hm.keySet());
		Collections.sort(entrylist);
		Map<Employee1, Integer> sortedMap = new LinkedHashMap<Employee1, Integer>();
		for (Employee1 e1 : entrylist) {
			sortedMap.put(e1, hm.get(e1));
		}
		System.out.println(sortedMap);

		// Sorting using Comparator
		List<Map.Entry<Employee1, Integer>> customList = new ArrayList<Map.Entry<Employee1, Integer>>(hm.entrySet());

		Collections.sort(customList, new Comparator<Map.Entry<Employee1, Integer>>() {
			public int compare(Entry<Employee1, Integer> o1, Entry<Employee1, Integer> o2) {
				Employee1 e1 = o1.getKey();
				Employee1 e2 = o2.getKey();
				if (e1.getEid() > e2.getEid())
					return -1;
				else if (e1.getEid() == e2.getEid())
					return 0;
				else
					return 1;
			}
		});
		System.out.println(customList);
	}
}
