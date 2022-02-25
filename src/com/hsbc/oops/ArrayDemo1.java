package com.hsbc.oops;
//Creating array of  Integer..........
class ArrayDemo1 
{
	public static void main(String[] args) 
	{
		int x[]=new int[4];
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
System.out.println(x.length);
for(int i=0;i<x.length;i++){
System.out.println(x[i]=i*i);
}
System.out.println(x[x.length-1]);
   
//creating array of float
float f[]=new float[5];
System.out.println(f);

		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
		System.out.println(f[3]);
			System.out.println(f[3]);
		System.out.println("With for loop  ");
for(int j=0;j<f.length;j++){
	System.out.println(f[j]);}
	f[0]=10;
f[1]=10.0f;
f[2]=2.5f;
f[3]=0.7f;
f[4]=4;
for(int j=0;j<f.length;j++){
	System.out.println(f[j]);
	}
//representing sequence of character using object of character

char ch[]=new char[4];
ch[0]='j';
ch[1]='a';
ch[2]='v';
ch[3]='a';
System.out.println(ch[ch.length-1]);
System.out.println(ch);

//creating array of Double
double d[]=new double[4];




 }
}
