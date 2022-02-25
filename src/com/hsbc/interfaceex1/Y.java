package com.hsbc.interfaceex1;

public class Y extends A implements Ijk, Xyz {

	@Override
	public void funX() {
		System.out.println("funX() of class Y");
	}

	@Override
	public void funI() {
		System.out.println("funI() of class Y");
	}

	public void funY() {
		System.out.println("funY() of class Y");
	}

	public void fun2() {
		System.out.println("fun2() of class Y");
	}

	public static void main(String[] args) {
		Y y1 = new Y();
	}

}
