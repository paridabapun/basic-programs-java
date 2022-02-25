package com.hsbc.methodinjava;

//Wap to find the factrial of a given no without using recursion
class Recursion {
	static long factorial(int num){
		long fact=1;
		while(num>0)
			fact *=num--;
			
		
		return fact;
	}

	
	public static void main(String[] args) {
		System.out.println("Factorial of 5 is :");
		System.out.println(Recursion.factorial(5));

	}

}
