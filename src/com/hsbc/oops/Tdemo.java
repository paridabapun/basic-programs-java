package com.hsbc.oops;
class Tdemo 
{
	int i,j;
	
	Tdemo(int i)
{
		System.out.println("The value of i before statement is "+i);
	System.out.println("The value of j before stmnt   "+j);
	i=i+1;
	j=j+1;
	System.out.println("The value of i is "+i);
	System.out.println(j);
}
	public static void main(String[] args) 
	{
		Tdemo t1=new Tdemo(5);
		System.out.println(t1.i);
System.out.println(t1.j);
}
}
