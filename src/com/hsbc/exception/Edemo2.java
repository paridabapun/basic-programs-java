package com.hsbc.exception;
class Edemo2 
{
	public static void main(String[] args) 
	{

	int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int k=Integer.parseInt(args[2]);
int l=Integer.parseInt(args[3]);
A a1=null;	
try{
int x=i/j;
x=x+1;
System.out.println("x : "+x);
if(x>5)
	a1=new A();
a1.funA();
int ar[]=new int[k];
ar[l]=x;
System.out.println(ar[1]);
System.out.println("end of try block");
}
catch(ArithmeticException ae){
System.out.println(ae);
}
catch(NullPointerException npe){
System.out.println(npe);
}
catch(ArrayIndexOutOfBoundsException aindex){
System.out.println(aindex);
}
System.out.println("i : "+i);
System.out.println("j : "+j);
System.out.println("k : "+k);
System.out.println("l : "+l);

System.out.println("This the last statement of my program");

	}
}
