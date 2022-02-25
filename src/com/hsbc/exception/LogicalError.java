/*Wap to show that you are doing a logical error but JVM 
doesnot goes to the state of ambiguity(confusion)*/
package com.hsbc.exception;
class LogicalError 
{
	public static void main(String[] args) 
	{
		
		int sum=0;
		for(int i=0;i<50;i++)//here i am doing a logical mistake ie i am adding 0 to 49 not 50 ie: a locical error and arise at run time

		{
		sum=sum+i;	
		}
		System.out.println("Sum of 0 to 50 no is :"+sum);
	}
}
