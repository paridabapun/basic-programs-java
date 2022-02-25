package com.hsbc.accessspecifier;
class Acess 
{
	public int x,y;
	private Acess(){
	x=1;
	y=2;
	System.out.println("Acess() of class Acess");
	}
	public void fun1(){
	System.out.println("fun1() of class Acess");
	x=x+1;
	y=y+1;
	}
	public static Acess getAcess(){
	
	Acess a1=new Acess();
	return a1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
