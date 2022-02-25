package com.hsbc.methodinjava;

//Wap for a static  method which accept data and returns result
class Sample3
{
	static double sum(double num1,double num2){
		double res=num1+num2;
		return res;
		
	}
}

public class StaticMethod {


	
	public static void main(String[] args) {
		double x=Sample3.sum(11, 22);
		System.out.println(x);
	

	}

}
