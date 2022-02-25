package com.hsbc.praveen;
//check the no is +ve or -Ve ......
import java.util.Scanner;


public class NumberGreater {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a no to check");
		int z=sc.nextInt();
		System.out.println(z);
		if(z>=0){
			if(z==0){
				System.out.println(z+" is zero");
			}
			else{
				System.out.println(z+" is positive");
			}

		}
		else{
			System.out.println(z+" is negetive");
		}
		
		
	}

}
