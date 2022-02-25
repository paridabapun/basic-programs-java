package com.hsbc.accessspecifier;
class TestAcess1 
{
	public static void main(String[] args) 
	{
	Outer1.Inner1 i1=new Outer1().new Inner1();//CE 

	}
}
