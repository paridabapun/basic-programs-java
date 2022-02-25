package com.hsbc.inheritance;

//Object of Super class is created first the the sub class object created

class Sub1 extends Super1 
{
	int x,y;
	Sub1(){
				System.out.println("***********Sub() is called**********");

	}
	public static void main(String[] args) 
	{
		Sub1 s1=new Sub1();
						System.out.println(s1.a);
						System.out.println(s1.b);
						System.out.println(s1.x);
						System.out.println(s1.y);

						}
}
