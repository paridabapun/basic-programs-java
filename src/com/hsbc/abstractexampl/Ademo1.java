package com.hsbc.abstractexampl;
class Ademo1 extends Abs1 
{
	public void funA(){
	System.out.println("FunA() of class Ademo1");
	}
	void fun1(){
	System.out.println("fun1() of class Ademo1");
	}

	public static void main(String[] args) {
	
	Ademo1 d1=new Ademo1();
	System.out.println(d1.i);
System.out.println(d1.i);
d1.funA();
d1.fun1();
d1.funB();
Abs1 a1=new Ademo1();
System.out.println(a1.i);
a1.funA();
a1.funB();
//a1.fun1();//CE





}
}