package com.hsbc.oops;
class Wdemo1 
{
	public static void main(String[] args) 
	{
		int x=13;
		Integer i1=new Integer(x);
		System.out.println(i1);
		i1=i1+15;
	System.out.println(i1);	
	System.out.println(i1+14);
		int i=i1.intValue();
		i=i*i;
		System.out.println(i);
		System.out.println("Hello World!");
	}
}
