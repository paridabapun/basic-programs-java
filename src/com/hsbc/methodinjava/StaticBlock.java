package com.hsbc.methodinjava;

//Wap to check whether a static block or static method is execute first by JVM
class StaticBlock{
	static{
		System.out.println("Static block executed");
	}




	public static void main(String[] args) {
		System.out.println("Static Method/Main method ");
		

	}
}


