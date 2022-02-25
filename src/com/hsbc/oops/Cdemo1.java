package com.hsbc.oops;
class Cdemo1 
{
	int i,j;
	Cdemo1(){
		System.out.println("Begining of Cdemo1() constructor");
	System.out.println(i);
	System.out.println(j);
	}
	void fun1(){
	i=1;
	j=2;
	System.out.println("*****	Inside fun1()	*****");

	}
	public static void main(String[] args) 
	{
		Cdemo1 c1=new Cdemo1();
		c1.fun1();
	
	
	}
}
