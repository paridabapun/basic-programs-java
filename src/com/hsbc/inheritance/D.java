package com.hsbc.inheritance;

class D extends C 
{
	int i,j;
	
	void f1()
	{
	System.out.println("Inside f1() of class D ");
	}
	void f6()
	{
	System.out.println("Inside f6() of class D ");
	}

	D(){
System.out.println("****D() *****");
}
D(int x){
System.out.println("D(int x) ****");
i=x;
j=x+1;

}


	public static void main(String[] args) 
	{


	}
}
