package com.hsbc.praveen;
import java.util.Scanner;


public class CheckLeapYear {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a valid year");
		int year=sc.nextInt();
		if(year%100==0 && year % 400==0){
			System.out.println(year+" is a leap year");
		}
		else if(year % 100!=0 && year % 4==0){
			System.out.println(year+" is a leap year");
		}
		else{
			System.out.println(year+" not a leap year");
		
	}

}
}
