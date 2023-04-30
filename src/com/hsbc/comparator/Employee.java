package com.hsbc.comparator;

import java.sql.Date;
import java.util.Comparator;

public class Employee implements Comparator<Employee> {

	private int employeeID;
	private String employeeName;
	private int salary;
	private Date doj;

	public Employee(int employeeID, String employeeName, int salary, Date doj) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salary = salary;
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", salary=" + salary + ", doj="
				+ doj + "]";
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getEmployeeID() > o1.getEmployeeID()) {
			return 1;
		} else {
			return -1;
		}
	}

}
