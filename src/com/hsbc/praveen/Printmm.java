package com.hsbc.praveen;
import java.util.Scanner;


public class Printmm {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		while(n>0){
			System.out.print("\t"+n);
			n--;
		}
		
	}

}
