package com.hsbc.multithreading;
class Parameterdemo1 
{
	int i,j;
	public void fun1(Parameterdemo1 d1)
	{
		try{
		Thread t1=new Thread();
		System.out.println(" i : " + d1.i);
		t1.sleep(200);
		System.out.println(" j : " + d1.j);
		System.out.println("Bapun");
			d1.fun1(new Parameterdemo1());
		System.out.println("Parida");
	 }
	 catch(InterruptedException ie){
		 ie.printStackTrace();
	 }
	}
	public static void main(String[] args)
	{
		Parameterdemo1 d1=new Parameterdemo1();
			d1.fun1(new Parameterdemo1());
		
		
					System.out.println("Hello World!");
	}
}
