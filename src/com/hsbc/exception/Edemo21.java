package com.hsbc.exception;
class Edemo21 
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
ar[1]=x;
System.out.println("end of try block");
}

catch(Exception e){
System.out.println(e);
}
/*catch(NullPointerException np){//unreachable block
System.out.println(np);
}*/


	}
}
