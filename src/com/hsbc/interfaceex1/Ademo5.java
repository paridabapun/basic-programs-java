package com.hsbc.interfaceex1;

public class Ademo5 extends Abs5 {

	@Override
	void fun2() {
		System.out.println("fun2() of class Ademo5");
	}

	void fun3() {
		System.out.println("fun3() of class Ademo5");
	}

	public static void main(String[] args) {
		Abs4 a4 = new Ademo5();
		a4.fun1();
		a4.fun2();
		Abs5 a5 = new Ademo5();
		a5.fun1();
		a5.fun2();
		a5.funA();

	}

}
