package com.hsbc.oops;
class StringBufferDemo3 
{
	public static void main(String[] args) 
	{
String s1="example";
StringBuffer sb=new StringBuffer(s1);
sb.reverse();
String s2=new String(sb);
System.out.println(s2);

	}
}
