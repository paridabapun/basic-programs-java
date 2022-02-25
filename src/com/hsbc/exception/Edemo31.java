package com.hsbc.exception;
class Edemo31 
{
	void funT(int a,int b){
		System.out.println("funT() of class Edemo3 Started...");
A a1=null;
try{
int x=a/b;
x=x+1;
System.out.println("x  : "+x);
if(x>5)
	a1=new A();
a1.funA();
}
catch(Exception e){
	System.out.println(e);

}
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
Edemo31 ob=new Edemo31();
ob.funT(i,j);

System.out.println("i   :"+i);
System.out.println("j   :"+j);
System.out.println("End of main()");




	}
}
