package com.hsbc.oops;
class Wdemo3 
{
	void fun1(Integer i1){
	System.out.println(i1);
	i1=i1*i1;
	System.out.println(i1);
	}
	public static void main(String[] args) 
	{
		Wdemo3 d1=new Wdemo3();
		d1.fun1(4);
	}
}
