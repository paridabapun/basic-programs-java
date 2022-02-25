package com.hsbc.praveen;
//WAP to to read 2 nos and print the biggest numbers..
import java.util.Scanner;
public class LogicBiggestno {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd no");
		int b=sc.nextInt();
		if(a>b){
			System.out.println(a+"  is greater than "+b);
		}
		else{
			System.out.println(a+" is smaller than "+b);
		}
		
	}

}
