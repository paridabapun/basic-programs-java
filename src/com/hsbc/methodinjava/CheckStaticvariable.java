package com.hsbc.methodinjava;
//wap by taking a static variable in Sample6 class check static variable will have only one copy in memory

class Sample6{
	 static int x=55;
	void display(){
		System.out.println(x);
	}
	
}
public class CheckStaticvariable {

	
	public static void main(String[] args) {
		Sample6 ref,ref1;
		ref=new Sample6();
		ref1=new Sample6();
		++Sample6.x;
		System.out.println("x in ref ");
		ref.display();
		
		System.out.println("x in  ref1");
		ref1.display();
		
		
	
	}

}
