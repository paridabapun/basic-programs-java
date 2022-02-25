package com.hsbc.interfaceex1;

abstract public class Abs2 {
	int i, j;

	Abs2() {
		System.out.println("Abs() constructor is executed......");
		i = 2;
		j = 3;
	}

	abstract public void fun1();

}
