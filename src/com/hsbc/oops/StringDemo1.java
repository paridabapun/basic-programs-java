package com.hsbc.oops;
class StringDemo1 
{
	public static void main(String[] args) 
	{


String s1="abc";
String s2="jkl";
String s3=new String("abc");
String s4="abc";
String s5=new String("abc");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s1.equals(s2));
if(s1==s2)
	System.out.println("s1 and s2 are both same");
else
System.out.println("s1 and s2 are different ");
if(s1==s3)
	System.out.println("s1 and s3 are both same");
else
System.out.println("s1 and s3 are different ");
		if(s1==s4)
	System.out.println("s1 and s4 are both same");
else
System.out.println("s1 and s4 are different ");
		if(s1==s5)
	System.out.println("s1 and s5 are both same");
else
System.out.println("s1 and s5 are different ");
		
		
		}
}
