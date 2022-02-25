package com.hsbc.accessspecifier;
class Outer1{
int x;
class Inner1{
public void funIn(){
System.out.println("funIn() of Inner1");
}//inner fun close
}//outer fun close
void funOu(){
	System.out.println();
	x=x+1;
	Inner1 i1=new Inner1();
	System.out.println(i1);
	i1.funIn();
	System.out.println("funOu() of class Outer1");
	
System.out.println("funOu() of class Outer1");

}


public static void main(String[] args) {
	//Outer1 o1=new Outer1();
	//Inner1 i2=new Inner1();
//in order to call the non static member of inner class there is an syntax

Outer1.Inner1  in=new Outer1().new Inner1();
int a=new Outer1().x;
 a=new Outer1().x+1;
in.funIn();	
}
}