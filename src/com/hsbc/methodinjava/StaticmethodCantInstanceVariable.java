package com.hsbc.methodinjava;

//Wap for to test whether a static method can acess the instance variable or not
class Sample4
{
	//int x;//Cannot make a static reference to the non-static field x
	 static int x;//Can make a static reference to the static field x
	Sample4(int x){
		Sample4.x =x;
	}
	static void acess(){
		System.out.println(x);
	}
}


public class StaticmethodCantInstanceVariable {

	
	public static void main(String[] args) {
		
		Sample4 ob=new Sample4(12);
		Sample4.acess();
		

	}

}
