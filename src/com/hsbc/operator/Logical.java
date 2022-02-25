package com.hsbc.operator;
public class Logical

{
	public static void main(String args[]) {
		int x=9;
		int y=0;
		/*if((++x)==10 && (++y)==1)
		{
			System.out.println(x);
			System.out.println(y);
		}*/
		/* In this if both the condition is true then code with in the block 
		 * will be executed if condition 1 is false then control never go to the 2nd condn also*/
		/*if((++x)==10 || (++y)==1)
		{
			System.out.println(x);
			System.out.println(y);
		}*/
		/*In this case the first cond. is evaluted and control goes to second cond only i
		 * if cond 1 is false*/
		if((++x)==11 && (++y)==1)
		{
			System.out.println(x);
			System.out.println(y);
		}
		/*else {
			System.out.println(x);
		System.out.println(y);
		}*/
	/*	if((++x)==22 || (++y)==1)
		{
			System.out.println(x);
			System.out.println(y);
		}*/
		
	}
}