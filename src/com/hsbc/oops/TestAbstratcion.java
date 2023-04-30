package com.hsbc.oops;

public abstract class TestAbstratcion {
	
	
	public TestAbstratcion() {
	System.out.println("Indiise TestAbstraction Const");
	}
	

	public abstract   void m1();

	  void m2() {
		System.out.println("Inside method of m2 of Test Abstraction");
	}

	public static void main(String[] args) {

		TestAbstratcion abstratcion = new TestAbstratcionImpl();
		System.out.println(abstratcion);
		abstratcion.m1();
		abstratcion.m2();
	}

}
