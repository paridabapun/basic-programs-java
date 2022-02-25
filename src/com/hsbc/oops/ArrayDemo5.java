package com.hsbc.oops;
class ArrayDemo5 
{
	public static void main(String[] args) 
	{

//String s1[]={"Bhagab"}; what happens here
//System.out.println(s1);
String s2[]=new String[5];
System.out.println(s2);
System.out.println(s2[1]);//why not this

String s3;
//System.out.println(s3);//why this
	
	s2[0]="Bapun";
s2[2]="Bapun Parida";
s2[3]="My Universe";
s2[4]="Bapun";
for(int i=0;i<s2.length;i++){
System.out.println(s2[i]);
}
String a1="Bapun";
String a2="Bapun";

if(a1==a2){
System.out.println("Both are same");
}
else{
System.out.println("Both are different");
}
if(s2[0]==s2[4]){
System.out.println("Both are same");
}
else{
System.out.println("Both are different");
}
System.out.println("Checking for the a3 and a4");
String a3=new String("Bapun");
String a4=new String("Bapun");
if(a3==a4){
System.out.println("Both are same");
}
else{
System.out.println("Both are different");
}

int x=s2[0].length();
System.out.println(x);
int x1=s2[2].length();
System.out.println(x1);

	}
}
