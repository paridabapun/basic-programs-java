package com.hsbc.praveen;
import java.util.Scanner;

//WAP to accept name,age and print eligible for voting or not
public class LoopEligible {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the person");
	String name=sc.nextLine();
	System.out.println("Enter the age of the person");
	int age=sc.nextInt();
	if(age>=18){
		System.out.println(name+" is eligible for voting");
		
	}
	else {
		System.out.println(name+" is not eligible for voting");
	}
	}

}
