package com.hsbc.methodinjava;

//Wap for a method without parameter and without return type
class Sample {
	private double num1,num2;
	Sample(double x,double y)
	{
		num1=x;
		num2=y;
	}
	void sum()//without parameter without return type
	{
		double res=(num1+num2);
		System.out.println("Sum ="+res);
	}
}

	public class FirstMethod{
		
	
	public static void main(String[] args) {
		Sample ob=new Sample(12, 13);
		ob.sum();
		
		
		
		
		
		
	}

}
