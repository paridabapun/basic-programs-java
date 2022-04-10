package com.hsbc.cloneexample;

public class TestConeEmployee implements Cloneable {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Employee employee = new Employee(1, "Bhagabata");
		Employee employee2 = (Employee) employee.clone();
		
		System.out.println(employee != employee2);
		System.out.println(employee.equals(employee2));
		
		//
		
		
	}

}
