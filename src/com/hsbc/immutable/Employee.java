package com.hsbc.immutable;

public final class Employee {

	private final String employeeId;
	private final String employeeName;
	private final Address addresss;

	public Employee(String employeeId, String employeeName, Address addresss) {
		System.out.println("Employee Constructor executed");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.addresss = addresss;

	}

	public String getEmployee_id() {
		return employeeId;
	}

	public String getEmployee_name() {
		return employeeName;
	}

	public Address getAddresss() {
		return addresss;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employeeId + ", employee_name=" + employeeName + ", addresss=" + addresss
				+ "]";
	}

}
