package com.hsbc.withgeneric;
public class UniqueEmployee {
	public String employee_ID;
	public  double salary;
	
	
	@Override
	public String toString() {
		return "\n"+"employee_ID=" + employee_ID + ", salary=" + salary + "]";
	}


	public UniqueEmployee(String employee_ID, double salary) {
		super();
		this.employee_ID = employee_ID;
		this.salary = salary;
	}


	public String getEmployee_ID() {
		return employee_ID;
	}


	public void setEmployee_ID(String employee_ID) {
		this.employee_ID = employee_ID;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public int hashCode() {
		return Integer.valueOf(employee_ID);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniqueEmployee other = (UniqueEmployee) obj;
		if (employee_ID == null) {
			if (other.employee_ID != null)
				return false;
		} else if (!employee_ID.equals(other.employee_ID))
			return false;
		return true;
	}
}
