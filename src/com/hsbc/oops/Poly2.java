package com.hsbc.oops;
class Poly2 
{
	void fun1(long x){
	System.out.println("Inside long parameter  "+x);
	}
	void fun1(int x){
	System.out.println("Inside int parameter  "+x);
	}
	void fun1(float x){
	System.out.println("Inside float parameter "+x);
	}
void fun1(double x){
System.out.println("Inside Double parameter "+x);
}
	public static void main(String[] args) 
	{
	Poly2 p1=new Poly2();
	p1.fun1('c');

	}
}
