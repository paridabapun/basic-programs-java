package com.hsbc.oops;

public  class CTest extends BTest{
	
	
	void m1(BTest b) {	
		 System.out.println("Two");
		 super.m1(new BTest());
		 }

}
