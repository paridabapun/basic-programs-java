package com.hsbc.inheritance;
class E extends D 
{
	int a,b;
	E()
	{
	super(3);
	i=x+1;
	}
	public static void main(String[] args) 
	{
		E e1=new E();
		System.out .println(e1.i);
		System.out .println(e1.j);
	}
}
