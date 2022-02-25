package com.hsbc.methodinjava;

//wap by taking a instance variable in Sample5 class check instance variable will have a separate copy in each object
class Sample5{
	int x=55;
	void display(){
		System.out.println(x);
	}
	
}

public class CheckInstance {

	public static void main(String[] args) {
		Sample5 ref,ref1;
		ref=new Sample5();
		ref1=new Sample5();
		++ref.x;
		System.out.println("x in ref ");
		ref.display();
		System.out.println("x in  ref1");
		ref1.display();
		

	}

}
