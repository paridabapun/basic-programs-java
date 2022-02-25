package com.hsbc.oops;

class Pdemo1 {
	private byte b;
	private short s;
	private int i;
	private long l;
	private double d;
	private float f;
	private char c;
	private boolean flag;

	public static void main(String[] args) {
		Pdemo1 p1 = new Pdemo1();
		System.out.println("Byte " + p1.b);
		System.out.println("Short" + p1.s);
		System.out.println("Int " + p1.i);
		System.out.println("long" + p1.l);
		System.out.println("double " + p1.d);
		System.out.println("float" + p1.f);
		System.out.println("char  " + p1.c);
		System.out.println("boolean " + p1.b);
		System.out.println("Boolean  " + p1.flag);
		System.out.println("=================");
		p1.i = (int) 10.3;
		System.out.println(p1.i);
		p1.b = (byte) 12.3;
		System.out.println(p1.b);
		p1.b = (byte) p1.i;
	}
}
