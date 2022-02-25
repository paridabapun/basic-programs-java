package com.hsbc.accessspecifier;
class Access5 
{
	int x,y;
	private Access5(){
	System.out.println("Access5() of Access5");
	}
	public static void main(String[] args) 
	{
		Access5 a1=new Access5();
		System.out.println(a1.x);
	}
}
