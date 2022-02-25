package com.hsbc.oops;
class Stdemo4 
{
		int i,j;
	static int x;
	static void fun1(){
	x=x+1;
	Stdemo4 d1=new Stdemo4();
	d1.i= x+1;
	System.out.println("Inside function 1()  ="+d1.i);
	}
	void fun2(){
		i=i+1;
		x=x+1;
	System.out.println("Bapun");
System.out.println("inside fun2() i= "+i);

	}
	public static void main(String[] args) 
	{
		Stdemo4 d1=new Stdemo4();
		x=3;
		fun1();
		d1.fun2();
		System.out.println(d1.i);
System.out.println(d1.x);

	


	}

}
