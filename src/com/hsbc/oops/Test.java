package com.hsbc.oops;

public class Test {
	Test(){
	System.out.println("Test() mExcequted");
	}

	
	public static void main(String[] args) throws ClassNotFoundException {
	//	short i=10.2f;
		//short j=10.3f;
		 //i=(j+i);
		 //System.out.println(i);
		// Test t1=new Test();
Class c=Class.forName("Test");//only class will loaded not object created....
System.out.println(c);
	}

}
