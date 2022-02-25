package com.hsbc.basiclogic;

public class IfElseTest {
	public static void main(String[] args) {

		int a = 5;
		int b = 1;

		System.out.println("<===scenerio 1===>");
		if (a > b) {
			System.out.println(a + " is greater than " + b);
		}
		System.out.println(b + " is greater than " + a);
		System.out.println("not executed");
		System.out.println("<===scenerio 2===>");
		if(a>b){
			System.out.println(a + " is greater than " + b);
		}
		else{
			System.out.println(b + " is greater than " + a);
			System.out.println("not executed");
		}
		System.out.println("<===scenerio 3===>");
		if(a<b){
			System.out.println(b + " is greater than " + a);
		}
		else
			System.out.println(a + " is greater than " + b);
			System.out.println("not executed");
		

	
	}//main

}//class close
