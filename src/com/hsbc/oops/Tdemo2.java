package com.hsbc.oops;
class Tdemo2 
{
	int i,j;
	Tdemo2(int i){
	i=i+1;
	j=i+1;
	this.i=i+1;
	System.out.println(this);
	}
	public static void main(String[] args) 
	{
		Tdemo2 t2=new Tdemo2(5);
		//System.out.println(this.i);
		System.out.println(t2.i);
	}
}
