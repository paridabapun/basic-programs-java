package com.hsbc.basiclogic;

import java.util.Scanner;

 
public class EvenOdd {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println
		("Enter a no to chech the no whether it is EVEN OR ODD");
		int num=sc.nextInt();
	
		if(num%2==0){
			System.out.println("The no "+num+" is a Even Number");
		}
		else{
			System.out.println("The no "+num+" is a Odd Number");
		}

	}

}
