package com.hsbc.oops;
class Odemo10 
{
	int x;
	A a1=new A();
Odemo10 d1;
	public static void main(String[] args) 
	{
		Odemo10 d1=new Odemo10();
	
System.out.println(d1);		
System.out.println(d1.d1);		
System.out.println(d1.a1);
d1.d1=new Odemo10();
System.out.println(d1.d1);
d1.d1.d1=new Odemo10();
d1.d1.d1.x=3;
d1.d1.d1.d1=d1;
System.out.println("In Last  "+d1.d1.d1.d1);
System.out.println("Only d1 "+d1);
int x=6;
System.out.println(d1.d1.d1.d1);
d1.d1.d1.d1.x=13;
System.out.println(d1.x);

	}

}
