package com.hsbc.oops;
class Odemo11 
{
	void fun1(A a1){
		System.out.println(a1);
		if(a1!=null){
		   a1.i=a1.i+1;
	System.out.println(a1.i); 
		   }
		   System.out.println("End of file ");
	}
	public static void main(String[] args) 
	{
		Odemo11 d1=new Odemo11();
		d1.fun1(null);
		A a1=new A();
		A a2=new A();
		d1.fun1(a2);
		System.out.println(a1.i);
		d1.fun1(new A());
		System.out.println(a1.i);
	}



}
