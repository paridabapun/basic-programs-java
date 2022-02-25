package com.hsbc.praveen;
import java.util.Scanner;

//WAP to find the age is teenage or more than 50 years
public class LoopAgecal {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=10 && age<=50){
		      if(age>10 && age<=18){
			
		System.out.println("You are Teenagers");
		      }
		      else 
		    {
			System.out.println("Not Teenages");
		}
		}
		      else{
		    	  if(age==0 || age>=100)
		    	  {
		    		  System.out.println("Not a valid age");
		    	  }
		    	  else{
		    		  System.out.println("it's is a child....");
		    	  }
		    	  

		
	}
}
}


