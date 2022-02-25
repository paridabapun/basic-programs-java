package com.hsbc.inheritance;

class Test12 
{
	public static void main(String[] args) 
	
		{
A a1=new D();
a1.f1();
a1.f2();
D d1=(D)a1;
a1.f1();
a1.f2();
d1.f1();
d1.f2();

	}
}
