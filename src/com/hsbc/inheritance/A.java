package com.hsbc.inheritance;

class A extends X {

	int i, j;

	void f1() {
		System.out.println("Inside f1() of class A ");
	}

	void f2() {
		System.out.println("Inside f2() of class A ");
	}

	void funA() {
		i = i + 1;

		System.out.println("******* Inside funA() ******* of class A");
	}

}
