package com.hsbc.accessspecifier;
class Acess3 
{
	public int x;
	int y;//declare with out any acess specifier
	void fun1(){
	x=x+1;
	y=y+1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
