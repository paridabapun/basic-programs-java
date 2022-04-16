package com.hsbc.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.hsbc.cloneexample.Student;

public class ArrayListEmpToList {

	public static void main(String[] args) {

		Employee employee = new Employee(1, "Bapun");
		Employee employee1 = new Employee(2, "Bhavya");
		Employee employee2 = new Employee(3, "Liza");

		List<Employee> employees = new ArrayList<>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);

		System.out.println(employees);

//		CONVERTING A LIST TO MAP of EMP

		Map<Integer, String> map = new HashMap<Integer, String>();

		for (Employee e : employees) {

			map.put(e.getEid(), e.getEname());
		}

		System.out.println(map);

//		CONVERTING Using Collectors.toMap() method

		 Map<Integer, List<String> >
         multimap = employees.stream().collect(
				Collectors.groupingBy(Employee::getEid, Collectors.mapping(Employee::getEname, Collectors.toList())));
		 System.out.println(multimap);

	}
}
