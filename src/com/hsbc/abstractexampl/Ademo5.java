package com.hsbc.abstractexampl;
class Ademo5 extends Abs5 
{
public void fun2(){
System.out.println("fun2() of class Ademo5 ");
}
void fun3(){
System.out.println("fun3() of class Ademo5");
}
	public static void main(String[] args) 
	{
		Abs4 a1=new Ademo5();
		a1.fun1();
a1.fun2();
Abs5 a2=new Ademo5();
a2.fun1();
a2.funA();
//a3.fun2();

	}
}
