package com.hsbc.oops;
class Stdemo6 
{
	void funT(){
	System.out.println(Stdemo4.x);
	Stdemo4 d1=new Stdemo4();
	d1.i=d1.x+1;
	d1.x=d1.i+1;
	System.out.println("End of FunT()");
	}

	public static void main(String[] args) 
	{
		Stdemo4.x=6;
		Stdemo6 t1=new Stdemo6();
		t1.funT();
	Stdemo4 d1=new Stdemo4();
	System.out.println();
	System.out.println(Stdemo4.x);

		System.out.println("Hello World!");
	}
}
