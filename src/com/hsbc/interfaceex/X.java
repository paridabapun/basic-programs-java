package com.hsbc.interfaceex;

class X implements Xyz {
	public void funX() {
		System.out.println("funX() of class X");
	}

	public void funY() {
		System.out.println("funY() of class X");
	}

	public void fun1() {
		System.out.println("fun1() of class X");
	}

	public static void main(String[] args) {

		X x1 = new X();
		System.out.println(x1);
		Xyz x2 = new X();
		System.out.println(x2);
		x1.funX();
		x1.funY();
		x1.fun1();
		System.out.println("Now calling with the interface Xyz reference...");
		x2.funX();
		x2.funY();
		// x2.fun1();

	}
}
