package com.hsbc.inheritance;

class X 
{
	int i,j,k;
	void funX(){
		System.out.println("Inside funX() of class X");
	
	}
	void funA(){
	System.out.println("Inside funA() of class X");
	}
public static void main(String args[]){

X x1=new X();
x1.funA();
}
}
