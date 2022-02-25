package com.hsbc.oops;
class Odemo4 

{
	
	int x;
	void fun1(){
		x=x+1;
		A a1=new A();
System.out.println("inside func 1  "  +a1.i);
		a1.i=x+1;
		System.out.println("inside func  "  +a1.i);

	}

	public static void main(String[] args) 
	{
	A a1=new A();
	Odemo4 d1=new Odemo4();
d1.x=3;
d1.fun1();
System.out.println(d1.x);

System.out.println(a1.i);
d1.fun1();
System.out.println(d1.x);
System.out.println(a1.i);


	}
}
