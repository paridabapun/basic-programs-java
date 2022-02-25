package com.hsbc.exception;
class EdemoThrw 
{
	//void funT(int a,int b)throws ArithmeticException,NullPointerException{
		void funT(int a,int b)throws Exception{
		System.out.println("funT() of class Edemo3 Started...");
A a1=null;

int x=a/b;
x=x+1;
System.out.println("x  : "+x);
if(x>5)
	a1=new A();
a1.funA();


a=a+1;
b=b+1;
System.out.println("a  : "+a);
System.out.println("b  : "+b);
System.out.println("  End of funT()  ");


	
	}
	public static void main(String[] args) 
	{
	int i=Integer.parseInt(args[0]);
	int j=Integer.parseInt(args[1]);
EdemoThrw ob=new EdemoThrw(); 
	//ob.funT(i,j);
	try{
	ob.funT(i,j);
	}
	catch(Exception e){
	System.out.println(e);
	}

System.out.println("i   :"+i);
System.out.println("j   :"+j);
System.out.println("End of main()");




	}
}
