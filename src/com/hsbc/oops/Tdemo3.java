package com.hsbc.oops;
class Tdemo3 
{
	int i,j;
	Tdemo3(){
	this(3);
	System.out.println("**** Tdemo3() ZERO Argument Constructor  ");
	
		System.out.println();

	}
	Tdemo3(int x){
		this(x,x+1);
				System.out.println();

	System.out.println("**** Tdemo3(int x) Constructor  ");
	System.out.println();
	}
	Tdemo3(int x,int y){
		
			System.out.println();

		System.out.println("****  Tdemo3(int x,int y) Constructor  ");

	}
	void funT(){
	//this(4);
	System.out.println("Inside FunT()*************");
	
	this.i=i+1;
	 
	System.out.println(i);
	}
	public static void main(String[] args) 
	{
		Tdemo3 t1=new Tdemo3();
		System.out.println();
		System.out.println("Object Created by calling all the constructor address of the object is= "+t1);
t1.funT();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
