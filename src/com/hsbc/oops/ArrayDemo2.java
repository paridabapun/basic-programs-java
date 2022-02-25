package com.hsbc.oops;
class ArrayDemo2
{
	public static void main(String[] args)
	{
		/*int x=10;
		float f=12.0f;
		if(x==f){
		System.out.println("Both are same");
		}
		else{
		System.out.println("Both are different");
		}
		*/
		char ch[]=new char[4];
		ch[0]='J';
ch[1]='a';
ch[2]='v';
ch[3]='a';
A a3[]= new A[5];
B b3[]= new B[4];
System.out.println(ch);
String s1[]={"java"};
/*if(a3[0]==b3[0]){
System.out.println("Both are same");
}
else{
System.out.println("Both are different");
}*/
ch[0]='T';
ch[2]='T';
System.out.println(ch);
System.out.println("ch  :" +ch );//what is this

A a1=new A();
System.out.println(a1);
System.out.println("a1   :"+a1);

Integer i1=new Integer(2254);
System.out.println(i1);
System.out.println("i1  :"+i1);//whis is is th

	}
}
