package com.hsbc.praveen;
//WAP find the greater value between two
import java.util.Scanner;


public class LoopGreater {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("The value of a "+a);
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("The value of b  "+b);
		if(a>b)
		{
			System.out.println(a+"  is greater");
		}
		else{
			System.out.println(b+" is greater");
		}
		System.out.println("\n press any key to close the application");
	}
}
