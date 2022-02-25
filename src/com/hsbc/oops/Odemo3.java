package com.hsbc.oops;
class Odemo3 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new A();
		A a3=a2;
		System.out.println(a1);
		System.out.println("HashCode  :"+a1.hashCode());
		System.out.println(a2);
		System.out.println(a3);
		A a4=a3;
		A a5=a2;
		System.out.println(a4);
System.out.println(a5);

		
	}
}
