package com.hsbc.oops;
class StringBufferDemo2 
{
	public static void main(String[] args) 
	{
		StringBuffer b1=new StringBuffer("abcd");
		StringBuffer b2=b1.append('x');
		System.out.println(b2);
		if(b1==b2){
				System.out.println("b1 & b2 both same");

		}
		else{
				System.out.println("b1 & b2 both different");

		}
				System.out.println("b1 :   "+b1);
				System.out.println("b1 :   "+b2);
StringBuffer b3=new StringBuffer("ijk");
//b3=b3 + "x";
String s1=b3 + "x";
System.out.println(s1);
	}
}
