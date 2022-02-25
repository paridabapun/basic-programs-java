package com.hsbc.interfaceex1;

public class X implements Xyz {

	@Override
	public void funX() {
		System.out.println("funX() of class X");
	}

	@Override
	public void funY() {
		System.out.println("funY() of class X");
	}

	void fun1() {
		System.out.println("fun1() of class X ");
	}

	public static void main(String[] args) {
		X x1 = new X();
		x1.fun1();
		x1.funX();
		x1.funY();
	}
}
