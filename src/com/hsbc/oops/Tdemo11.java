package com.hsbc.oops;
class Tdemo11 
{
	int i,j;
	void funT(int i){
		
System.out.println("Inside FunT()");
	i=i+1;
	j=j+1;
	this.i=i;
	System.out.println(this);
	System.out.println(i);
		System.out.println(j);
	
	}

	public static void main(String[] args) 
	{
		Tdemo11 t1=new Tdemo11();
		t1.funT(4);
System.out.println("Outside FunT()");
		System.out.println(t1.i);
		System.out.println(t1.j);
		System.out.println(t1);
		//System.out.println(this);
	}
}
