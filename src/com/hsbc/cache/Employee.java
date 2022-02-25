package com.hsbc.cache;

public class Employee {

	private String id;
	private double salary;

	public String getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	public Employee(String id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
}
