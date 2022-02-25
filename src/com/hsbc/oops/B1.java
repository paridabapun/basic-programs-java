package com.hsbc.oops;
class B1 extends A 
{
	int x;
	int y;
	public static void main(String[] args) 
	
	{
		B1 ob=new B1();
		//System.out.println(ob.x);
		//System.out.println(ob.i);
		 System.out.println("\t"+"THis is a String Program");
		  System.out.println();
		  System.out.println();
		  System.out.println();
		  System.out.println();
		String s1=" WELCOME 2 JAVA ";
				String s2=s1.trim();
System.out.println("	The original String provided ="+s1);
		String s3=s2.substring(0,7);
		String s4=s2.substring(8,9);
        String s5=s2.substring(10);
		System.out.println();
		System.out.println();System.out.println();
		System.out.println();
           
//System.out.println(s3);
//System.out.println(s4);
//System.out.println(s5);
String s6=s3.concat(s4);
//System.out.println(s6);
String s7=s6.concat(s5);
System.out.println();
System.out.println("	The final String after removing all the spaces ="+s7);

}
}
