package com.hsbc.oops;
class Stdemo2 
{
	int i,j;
	static int x;
	static void fun1(){
		System.out.println(x);
	x=x+1;
	Stdemo2 d1=new Stdemo2();
	d1.i=x+1;
	d1.j=x+2;
		System.out.println("After operation "+d1.i);
			System.out.println("After operation "+d1.j);
	
	}
	public static void main(String[] args) 
	{
		x=3;
fun1();
System.out.println(x);
Stdemo2 d2=new Stdemo2();
System.out.println(d2.i);
System.out.println(d2.j);
fun1();
System.out.println(x);

}
} 