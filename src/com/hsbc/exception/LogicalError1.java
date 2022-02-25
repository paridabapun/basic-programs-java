//WAP  a  program to show that you are doing a logical error that makes jvm goes to the state of ambiguty
package com.hsbc.exception;
class LogicalError1 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=0;
		int result=x/y;//making an logical error
System.out.println(result);
	}
}
