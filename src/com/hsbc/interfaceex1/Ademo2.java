package com.hsbc.interfaceex1;

public class Ademo2 extends Abs2 {

	@Override
	public void fun1() {
		System.out.println("fun1() of class Ademo2");
	}

	public static void main(String[] args) {
		Ademo2 a2 = new Ademo2();
		System.out.println(a2.i);
	}

}
