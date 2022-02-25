package com.hsbc.interfaceex1;

public class Ademo6 extends Abs6 {

	@Override
	public void funY() {
		System.out.println("funy()  of class Ademo6");
	}

	public void fun1() {
		System.out.println("fun1() of class Ademo6");
	}

	public static void main(String[] args) {
		Xyz x1 = new Ademo6();
		x1.funX();
		x1.funY();
	}

}
