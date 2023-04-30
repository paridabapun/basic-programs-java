package com.hsbc.cloneexample;

import java.util.Objects;

public class Employee implements Cloneable {

	private int employee_ID;
	private String employee_Name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Employee [employee_ID=" + employee_ID + ", employee_Name=" + employee_Name + "]";
	}

	/**
	 * @param employee_ID
	 * @param employee_Name
	 */
	public Employee(int employee_ID, String employee_Name) {
		super();
		this.employee_ID = employee_ID;
		this.employee_Name = employee_Name;

	}

	public int getEmployee_ID() {
		return employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}

	public String getEmployee_Name() {
		return employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employee_ID, employee_Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employee_ID == other.employee_ID && Objects.equals(employee_Name, other.employee_Name);
	}

}
