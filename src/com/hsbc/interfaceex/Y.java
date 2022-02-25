package com.hsbc.interfaceex;
class Y extends A implements Xyz,Ijk 
{
		public void funX(){
		
		System.out.println("funX() of class Y");
		}
		public void funY(){
		System.out.println("funY of class Y");
		
		}
		public void fun1(){
		System.out.println("fun1 of class Y");
		
	
	}

	public void funI(){
		System.out.println("funI() of class Y");
	}	

	public static void main (String args[]){
	Y y1=new Y();
	y1.funX();
	y1.funY();
	y1.funI();
	y1.fun1();
	System.out.println("Now Calling all the function using the interface reference");
	Xyz x1=new Y();
	System.out.println(x1);
	x1.funX();
	x1.funY();
	Ijk i1=new Y();
	System.out.println(i1);

	i1.funI();
	i1.funX();
	//i1.funYm();
	}
}
