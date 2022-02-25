package com.hsbc.oops;
class Odemo8 
{
	int x;
	A a1;
	void funT(){
	System.out.println(a1);
	x=x+1;
	if (a1!=null)
	{
		a1.i=a1.i+x;
		a1.funA();
	}
	System.out.println("End of File ");
		
	
	
	}
	public static void main(String[] args) 
	{
		Odemo8 d1=new Odemo8();
		d1.x=3;
		d1.funT();
d1.a1=new A();
System.out.println(d1.x);
System.out.println(d1.a1.i);
d1.funT();
System.out.println(d1.x);
System.out.println(d1.a1.i);

	}
}
