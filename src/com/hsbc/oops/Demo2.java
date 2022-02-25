package com.hsbc.oops;
 class Demo2 
{
	int i=1,j=2;
	void fun1(){
		i=i+1;
		j=j+1;
	}

	public static void main(String[] args) 
	{
		Demo2 d1=new Demo2();
		System.out.println(d1.i);
	System.out.println(d1.j);
d1.fun1();
d1.fun1();

System.out.println(d1.i);
	System.out.println(d1.j);
}
}
