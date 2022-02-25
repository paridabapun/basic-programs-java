package com.hsbc.praveen;
//WAP with one user defined method calling another user define method

public class Example2 {
static void m1(){
	System.out.println("This is m1() method");
	m2();
}
static void m2(){
	System.out.println("This is method m2()");
}
public static void main(String args[]) {
	m1();
	
}
}
