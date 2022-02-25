package com.hsbc.oops;
class Odemo13
{
	A getA(int x){
		A a1=new A();
		a1.i=x;
		a1.j=x+1;
		return (a1);

	}
	public static void main(String[] args) 
	{
		Odemo13 d1=new Odemo13();
		A a1=d1.getA(5);
System.out.println(a1.i);

System.out.println(a1.j);

		
}
}