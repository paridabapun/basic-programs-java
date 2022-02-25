package com.hsbc.oops;
class ArrayDemo4 
{
	public static void main(String[] args) 
	{

		A a1[]=new A[4];
		System.out.println(a1);
		A a2=new A();
		System.out.println(a2);
System.out.println("Size   :"+a1.length);
System.out.println(a1[0]);
System.out.println(a1[1]);
System.out.println(a1[2]);
System.out.println(a1[3]);
a1[0]=new A();
a1[1]=new A();
a1[2]=new A();
a1[3]=new A();
System.out.println(a1[0]);
System.out.println(a1[1]);
System.out.println(a1[2]);
System.out.println(a1[3]);
a1[3]=a1[2];

System.out.println("Make some operations   ");
System.out.println(a1[0]);
System.out.println(a1[1]);
System.out.println(a1[2]);
System.out.println(a1[3]);
a1[0].i=13;
a1[2].i=113;
System.out.println("i :"+a1[3].i);
for(int i=0;i<a1.length;i++)

		{
		System.out.println(a1[i]);
		a1[2].funA();
		}
	}
}
