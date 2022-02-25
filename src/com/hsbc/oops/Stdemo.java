package com.hsbc.oops;
class Stdemo 
{
	int i,j;
	static int x=5;

static void fun1()
{
	x=x+1;
Stdemo d1=new Stdemo();
d1.i=x+1;
d1.j=x+2;
}

	public static void main(String[] args) 
	{
x=3;
Stdemo d1=new Stdemo();
fun1();
System.out.println(d1.i);
	}
}
