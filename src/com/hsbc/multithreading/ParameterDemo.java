package com.hsbc.multithreading;
class ParameterDemo
{
	int i,j;
	public void fun1(ParameterDemo d1)
	{
		
		System.out.println(" i : " + d1.i);
		
		System.out.println(" j : " + d1.j);
		System.out.println("Bapun");
			d1.fun1(new ParameterDemo());
		System.out.println("Parida");
	 }

	public static void main(String[] args)
	{
		ParameterDemo d1=new ParameterDemo();
			d1.fun1(new ParameterDemo());
		
		
					System.out.println("Hello World!");
	}
}
