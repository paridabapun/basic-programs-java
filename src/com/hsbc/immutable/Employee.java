package com.hsbc.immutable;

public final class Employee {

	private final String employee_id;
	private final String employee_name;
	private final Address addresss;

	public Employee(String employee_id, String employee_name, Address addresss) {
		System.out.println("Employee Constructor executed");
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.addresss = addresss;

	}

	public String getEmployee_id() {
		return employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public Address getAddresss() {
		return addresss;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", addresss=" + addresss
				+ "]";
	}

}
