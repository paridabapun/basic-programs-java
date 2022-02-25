package com.hsbc.interfaceex1;

public class Ademo1 extends Abs1 {

	void fun1() {
		System.out.println("fun1() of class Ademo1");
	}

	public void funA() {
		System.out.println("funA() of class Ademo1");

	}

	public static void main(String[] args) {
		Ademo1 a1 = new Ademo1();
		Abs1 a2 = new Ademo1();
		System.out.println(a1.j);
		System.out.println(a1.i);
		a1.fun1();
		a1.funA();
		a1.funB();
		System.out.println(a2.i);
		System.out.println(a2.j);
		a2.funA();
		a2.funB();
		// a2.funI();

	}
}