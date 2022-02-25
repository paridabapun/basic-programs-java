package com.hsbc.withoutgeneric;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {

		Student s1 = new Student(1, "K");
		Student s2 = new Student(10, "A");
		Student s3 = new Student(5, "Z");
		Student s4 = new Student(2, "X");
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(s1);
		listStudent.add(s2);
		listStudent.add(s3);
		listStudent.add(s4);
		System.out.println(listStudent);
		/*
		 * Collections.sort(listStudent);
		 * 
		 * // USING COMPARABLE INTERFACE
		 * 
		 * System.out.println("Using Comparable comapreTo() " + "\n" + listStudent);
		 * 
		 * // USING TREESET OBJECT Set<Student> students = new
		 * TreeSet<Student>(listStudent); System.out.println("Using Treeset objects");
		 * System.out.println(students);
		 */

		// USING COMPARATOR OBJECT
		// USING ID Comparator

		System.out.println("//USING ID Comparator");
		Collections.sort(listStudent, new IdComparator());

		System.out.println(listStudent);

	}
}
