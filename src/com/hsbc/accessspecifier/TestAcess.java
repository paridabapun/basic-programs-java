package com.hsbc.accessspecifier;
class TestAcess 
{
	public static void main(String[] args) 
	{
		//Acess a1=new Acess();
		Acess a1=Acess.getAcess();
		System.out.println(a1);
		a1.fun1();


	}
}
