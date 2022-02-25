package com.hsbc.oops;
class Demo1 
{
	int i=1,j=2;
	public static void main(String[] args) 
	{
		int x=0;
		System.out.println(x);//0
		x=x+1;//1
		System.out.println(x);//1
		Demo1 d1=new Demo1();
System.out.println(d1.i);//1

System.out.println(d1.j);//2
d1.i=d1.i+1;
d1.j=d1.j+1;

System.out.println(d1.i);//2

System.out.println(d1.j);//3

d1.i=d1.j+1;
d1.j=d1.i+1;

System.out.println(d1.i);//4

System.out.println(d1.j);//5

	}
}
