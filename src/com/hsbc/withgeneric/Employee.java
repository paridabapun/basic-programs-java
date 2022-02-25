package com.hsbc.withgeneric;

//EMPLOYEE SORTING ORDER OF EMPLOYEE BASED ON EMPLOYEE_ID,EMPLOYEE_NAME,EMPLOYEE_NAME,SALARY

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Employee {

	private int employee_ID;
	private String employee_Name;
	private Date joining_date;
	private double salary;

	public Employee(int eid, String ename, Date doj, double salary) {
		super();
		this.employee_ID = eid;
		this.employee_Name = ename;
		this.joining_date = doj;
		this.salary = salary;
	}
	public Employee(int eid,  double salary) {
		super();
		this.employee_ID = eid;
		this.salary = salary;
	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		Employee employee1 = new Employee(109, "Dhananjay", new Date(19 - 01 - 2019), 95000);
		Employee employee2 = new Employee(105, "Bhagabata", new Date(13 - 07 - 2015), 38000);
		Employee employee3 = new Employee(102, "Sidharth", new Date(11 - 07 - 2016), 45000);
		Employee employee4 = new Employee(106, "Sunil", new Date(02 - 30 - 2015), 32000);
		Employee employee5 = new Employee(108, "Malay", new Date(10 - 07 - 2015), 35000);
		Employee employee6 = new Employee(104, "Prasanna", new Date(05 - 03 - 2013), 33000);

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);

		System.out.println(employees);

		/* START SORTING USING EMPLOYEE_ID IN ASCENDING ORDER */

		System.out.println("SORTING USING EMPLOYEE_ID IN ASCENDING ORDER");

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee em1, Employee em2) {
				if (em1.employee_ID > em2.employee_ID) {
					return 1;
				} else if (em1.employee_ID < em2.employee_ID) {
					return -1;
				}
				return 0;
			}
		});
		System.out.println("==================================");
		System.out.println(employees);
		// END SORTING USING EMPLOYEE_ID IN ASCENDING ORDER

		// START SORTING USING EMPLOYEE_ID IN DESCENDING ORDER
		System.out.println("SORTING USING EMPLOYEE_ID IN DESCENDING ORDER");

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee em1, Employee em2) {
				if (em1.employee_ID > em2.employee_ID) {
					return -1;
				} else if (em1.employee_ID < em2.employee_ID) {
					return 1;
				}
				return 0;
			}
		});
		System.out.println("==================================");
		System.out.println(employees);
		// END SORTING USING EMPLOYEE_ID IN DESCENDING ORDER

		// START SORTING ACCORDING TO EMPLOYEE NAME
		System.out.println("SORTING ACCORDING TO EMPLOYEE NAME");

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.employee_Name.compareTo(o2.employee_Name);
			}

		});

		System.out.println("====================================");
		System.out.println(employees);
		// END SORTING ACCORDING TO EMPLOYEE NAME

		// START SORTING ACCORDING TO EMPLOYEE NAME IN DESCENDING ORDER
		System.out.println("START SORTING ACCORDING TO EMPLOYEE NAME IN DESCENDING ORDER");

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return -o1.employee_Name.compareTo(o2.employee_Name);
			}

		});

		System.out.println("====================================");
		System.out.println(employees);
		// END SORTING ACCORDING TO EMPLOYEE NAME DESCENDING ORDER

		// START SORTING ACCORDING TO JOINING DATE OF EMPLOYEE

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.joining_date.compareTo(o2.joining_date);
			}

		});
		System.out.println("SORTING ACCORDING TO JOINING DATE OF EMPLOYEE");
		System.out.println(employees);
		// END SORTING ACCORDING TO JOINING DATE OF EMPLOYEE

		// START SORTING ACCORDING TO HIGHEST SALARY OF EMPLOYEE
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.salary < o2.salary) {
					return 1;
				} else if (o1.salary > o2.salary) {
					return -1;

				}
				return 0;
			}

		});
		System.out.println("SORTING ACCORDING TO HIGEST SALARY OF EMPLOYEE");
		System.out.println(employees);
		// END SORTING ACCORDING TO HIGHEST SALARY OF EMPLOYEE

		// START SORTING ACCORDING TO LOWEST SALARY OF EMPLOYEE
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.salary < o2.salary) {
					return -1;
				} else if (o1.salary > o2.salary) {
					return 1;

				}
				return 0;
			}

		});
		System.out.println("SORTING ACCORDING TO LOWEST SALARY OF EMPLOYEE");
		System.out.println(employees);
		// END SORTING ACCORDING TO LOWEST SALARY OF EMPLOYEE

	}

	@Override
	public String toString() {
		return "ID=" + employee_ID + " Name=" + employee_Name + " date=" + joining_date + " salary=" + salary + "\n";
	}

}
