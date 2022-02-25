package com.hsbc.basiclogic;

//WAP to to return a value from the method
public class CallingMethod {

	
	public static void main(String[] args) {
		int res=CallingMethod.myMethod(10);
		System.out.println(res);
		
	}

	 static int myMethod(int i) {
		
		return i*i;
		
		
	}

}
