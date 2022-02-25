package com.hsbc.praveen;
//What is the output of the program
public class Example5 {
public static void  main(String args[]) {
	System.out.println("Example 5 main method going on");
	m1();
		
}
static void m1(){
	System.out.println(" M1 method going on");
	main(new String[0]);	
}
}