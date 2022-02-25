package com.hsbc.oops;
class Stdemo3 
{
	int i,j;
	static int x;
	public static void main(String[] args) 
	{

x=13;
Stdemo3 d1=new Stdemo3();
Stdemo3 d2=null;
Stdemo3 d3=new Stdemo3();
Stdemo3 d4=new Stdemo3();
d1.i=12;
//d2.i=10;
d3.i=3;
d4.i=5;
System.out.println("Static value is"+d1.x);
System.out.println("Static value is"+d2.x);
System.out.println("Static value is"+d3.x);
System.out.println("Static value is"+d4.x);

System.out.println(d1.i);
System.out.println(d1.j);
System.out.println(d1);
System.out.println(d3);
System.out.println(d4);



	}
}
