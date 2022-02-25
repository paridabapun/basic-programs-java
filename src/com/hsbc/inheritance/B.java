package com.hsbc.inheritance;

class B extends A {
	int x, y;

	void funB() {
		x = x + 1;
		i = i + 1;

		System.out.println("******** Inside funB() ********");
		System.out.println(x);
		System.out.println(i);

	}

	void funA() {
		System.out.println("********Inside funA() of class B");
	}

	void f2() {
		System.out.println("Inside f2() of class B ");
	}

	void f3() {
		System.out.println("Inside f3() of class B ");
	}

	void f4() {
		System.out.println("Inside f4() of class B ");
	}

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.i);
		System.out.println(b1.j);
		b1.funA();
		b1.funB();

	}
}
