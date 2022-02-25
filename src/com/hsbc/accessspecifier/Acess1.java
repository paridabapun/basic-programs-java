package com.hsbc.accessspecifier;

class Acess1 {
	private Acess1() {
	}
	public Acess1(int x) {
	}

	public int x;
	private int y;

	public void fun1() {
		System.out.println("x  :" + x);
		System.out.println("y  :" + y);// private members available with in the same class

	}

	public void fun2() {
		x = x + 1;
		y = y + 1;
		System.out.println("y  :" + y);

	}

	public static void main(String args[]) {
		Acess1 a1 = new Acess1();

		a1.x = 1;
		a1.y = 2;
		a1.fun2();
		a1.fun1();
		/*
		 * Acess2 a2=new Acess2(); a2.y=3; System.out.println(a2.x);
		 * System.out.println(a2.y);
		 */
	}
}
