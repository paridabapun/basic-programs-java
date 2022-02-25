package com.hsbc.interfaceex1;

public class Itest2 {
	public static void main(String[] args) {
		Xyz x1 = new X();
		System.out.println(x1);
		x1.funX();
		x1.funY();
		Xyz x2 = new Y();
		x2.funX();
		x2.funY();
		Ijk i1 = new Y();
		System.out.println(i1);
		i1.funI();
		i1.funX();
	}

}
