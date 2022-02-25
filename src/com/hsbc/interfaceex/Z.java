package com.hsbc.interfaceex;

public class Z extends X {

	public void funX() {
		System.out.println("funX() of class Z");
	}

	public void funZ() {
		System.out.println("funZ() of class Z");
	}

	public static void main(String[] args) {

		Xyz x1=new Z();
		x1.funX();
		x1.funY();
	}

}
