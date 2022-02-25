package com.hsbc.oops;
class Stdemo5 
{

	static int x=4;
	public static void main(String[] args) 
	{
Stdemo4.x=6;


System.out.println(Stdemo4.x);
System.out.println(x);
Stdemo4 d1=new Stdemo4();
System.out.println("The value of i"+d1.i);
System.out.println(d1.x);
Stdemo4.fun1();
System.out.println(x);

System.out.println(d1.i);
System.out.println(d1.x);




	}

}
