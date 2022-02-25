package com.hsbc.oops;
class Demo3 
{
	int i=2,j=3;
	void fun1(){
	i=i+1;
	j=j+1;	   }

	void fun2(){
	fun1();
		System.out.println(i);
			System.out.println(j);
	}
	public static void main(String[] args) 
	{
		Demo3 d1=new Demo3();
			System.out.println(d1.i);//2
			System.out.println(d1.j);//3
		d1.fun1();
		System.out.println(d1.i);//i=3,i=4
			System.out.println(d1.j);//4
		d1.fun2();//i=4,i=5
	System.out.println("The value after fun 2"+d1.i);//4
		System.out.println(d1.j);//5
}
}