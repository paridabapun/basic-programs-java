package com.hsbc.praveen;
//WAP to accept a number and print if the no is even or odd
import java.util.Scanner;
public class LoopEvenOrOdd  {
	public static void main(String args[])throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a no to check even or odd");
		int n=sc.nextInt();
		System.out.println("You enter the no "+n);
		
		System.out.println("See below the result wait...");
		Thread t=new Thread();
		t.sleep(4000);
		if(n%2==0){
			System.out.println(n+" is a Even no");
		}
		else{
			System.out.println(n+" is a odd no");
		}
	}

}
