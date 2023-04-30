package com.hsbc.comparator;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparatorForEmp {

	public static void main(String[] args) {

//		CREATING EMPLOYEE OBJECT WITH 4 argument constructor  
		Employee em1 = new Employee(1, "Bapun", 20000, new Date(02 - 02 - 1991));
		Employee em2 = new Employee(2, "Liza", 2000, new Date(02 - 02 - 1997));
		Employee em3 = new Employee(3, "Geeta", 12000, new Date(02 - 02 - 1985));
		Employee em4 = new Employee(4, "Prince", 0, new Date(02 - 02 - 2016));
		Employee em5 = new Employee(5, "Ganesh", 30000, new Date(02 - 02 - 1980));
		List<Employee> employees = new ArrayList<Employee>();

//		ADDING EMPLOYEES TO EMPLOYEE LIST
		employees.add(em1);
		employees.add(em2);
		employees.add(em3);
		employees.add(em4);
		employees.add(em4);
		employees.add(em5);

//		System.out.println(employees);
		for (Employee e : employees) {
			System.out.print(e.getEmployeeID() + " ");
			System.out.print(e.getEmployeeName() + " ");
			System.out.print(e.getSalary() + " ");
			System.out.print(e.getDoj() + " ");

			System.out.println();
		}

		Comparator<Employee> comparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return 0;
			}
		};

	}

}
