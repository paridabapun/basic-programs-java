package com.hsbc.java8interviewquestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
	

	static void duplicateElements(List<Integer> integers) {

		Set<Integer> set = new HashSet<>();

		List<Integer> list = integers.stream().filter(s -> !set.add(s)).collect(Collectors.toList());
		System.out.println(list);
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20, 40, 50);

		duplicateElements(integers);
		

		
//		Multiply with Functional Interface
		FInterface fInterface = (a,b) -> a * b; 
		
		System.out.println(fInterface.multyply(3, 4));
		
	}
}
