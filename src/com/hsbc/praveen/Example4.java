package com.hsbc.praveen;
//WAP to call the main method of one class from another class

public class Example4 {

	public static void main(String args[]) {
		System.out.println("Main method in progress");
		
	}
}
class A1{
	public static void  main(String atrgs[]) {
		System.out.println("Main method of class A1");
		Example4.main(null);
		Example4.main(new String[1]);
		//Example4.main(new String[-2]);//passing -ve number as size to array
		Example4.main(new String[0]);
	}
	
}
