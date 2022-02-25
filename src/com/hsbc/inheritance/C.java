package com.hsbc.inheritance;

class C extends B {
	int i, j;

	void f5() {
		System.out.println("Inside f5() of class C ");
	}

	void f3() {
		System.out.println("Inside f3() of class C ");
	}

	void funA() {
		System.out.println("Inside funA() of class C ");
	}

	void f2() {
		System.out.println("Inside f2() of class C ");
	}

	void funC() {
		i = 6;
		super.i = 3;
		funA();
		super.funA();
		j = 1;
		super.j = 113;
	}

	public static void main(String[] args) {

	}
}
