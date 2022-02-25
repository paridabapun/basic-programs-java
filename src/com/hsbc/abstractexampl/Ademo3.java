package com.hsbc.abstractexampl;
class Ademo3 extends Abs3 
{
void funB(){
System.out.println("funB of class Ademo3");
}
	public static void main(String[] args) 
	{
		Abs3 a1=new Ademo3();
		a1.funA();
		//a1.funB();
System.out.println(a1.i);
System.out.println(a1.j);

}
}
