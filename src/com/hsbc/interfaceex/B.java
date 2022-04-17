package com.hsbc.interfaceex;

public class B extends A {

	int i, k;

	void fun2() {
		System.out.println("fun2 of class B");
	}

	void fun1() {
		System.out.println("fun1 of class B");
	}

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new B();
		
		a2.fun1();
		a2.funA();
		

	}

}
