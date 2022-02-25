package com.hsbc.oops;
class Poly4 
{
	/*void fun1(int x,int y){
	System.out.println(" fun1(int x,int y)");
	}
	*/
	void fun1(int x,float y){
	System.out.println("fun1(int x,float y)");
	}
	void fun(float x,int y){
	System.out.println("fun(float x,int y)");

	}

	public static void main(String[] args) 
	{
		int i=5;
	float j=5.9f;
		
	Poly4 p1=new Poly4();
	
	p1.fun1(i,i);
p1.fun1(i,j);

	
	}

}
