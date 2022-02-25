package com.hsbc.interfaceex1;

public class Ademo3 extends Abs3 {
	void funB() {
		System.out.println("funb() of class Ademo3");
	}

	public static void main(String[] args) {
		Abs3 a3 = new Ademo3();
		a3.funA();
		// a3.funB();
		System.out.println(a3.i);
		System.out.println(a3.j);
	}
}
