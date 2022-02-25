package com.hsbc.inheritance;

//A class is not extending any class extending Object class

class Test1 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println(a1);
		System.out.println(a1.toString());//we access the method toString() because it present in object class
//Object of Object class is known as the root object ... ie class A extends Object so that
System.out.println(a1.hashCode());
//System.out.println(a1.toString());

	}
}
