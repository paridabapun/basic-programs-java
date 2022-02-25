package com.hsbc.praveen;
import java.util.Scanner;


public class WhileLoop {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no to to print that no starting from 0");
	int n=sc.nextInt();
	while(n>0){
		System.out.print("\t"+n);
		n--;
	}
	
}
}
