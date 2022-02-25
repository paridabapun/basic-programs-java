package com.hsbc.oops;
class Cdemo2 
{
	int i,j;
	Cdemo2(){
	System.out.println("Inside Cdemo() default constructor ");
	}
	Cdemo2(int x){
	i=x;
	j=x+1;
	System.out.println("Inside Cdemo2(int x) ");
	}
	Cdemo2(int x,int y){
	i=x;
	j=y;
System.out.println("Inside Cdemo2(int x,int y) constructor");
	}
Cdemo2(boolean flag){
System.out.println("Constructor defined to accept the the value of boolean");
}
	public static void main(String[] args) 
	{
		Cdemo2 d1=new Cdemo2(4);
		System.out.println(d1.i);
		System.out.println(d1.j);
		Cdemo2 d2=new Cdemo2(4,4);
		
		System.out.println(d2.i);
		System.out.println(d2.j);
		Cdemo2 d3=new Cdemo2(true);
		
		
	}
}
