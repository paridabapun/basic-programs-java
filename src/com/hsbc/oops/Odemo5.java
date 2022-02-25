package com.hsbc.oops;

class  Odemo5 
{
	
	
	int x;
	void fun1(){
	x=x+1;
	Odemo5 d1=new Odemo5();
	d1.x=x+1;
	System.out.println("inside func  "  +d1.x);
	
	}
	public static void main(String[] args) 
	{
		Odemo5 d1=new Odemo5();
		d1.fun1();
		
	System.out.println("inside OBJ  "  +d1.x);
	d1.x=3;
	System.out.println("inside OBJ  "  +d1.x);
	d1.fun1();
	System.out.println("inside OBJ  "  +d1.x);

	}
}
