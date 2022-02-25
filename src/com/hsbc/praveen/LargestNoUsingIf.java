package com.hsbc.praveen;
import java.util.Scanner;

//WAP to find the largest no using if statement
public class LargestNoUsingIf {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first noo......");
	int a=sc.nextInt();
	System.out.println("Enter the second nooo.....");
	int b=sc.nextInt();
	System.out.println("Enter the third no.....");
	int c=sc.nextInt();
	if(a>=b && a>=c){
		System.out.println(a+" is large.........");
	}
	if(b>=a && b>=c){
		System.out.println(b+" is Large..........");
	}
	
}
}
