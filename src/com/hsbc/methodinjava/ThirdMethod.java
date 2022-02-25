package com.hsbc.methodinjava;

//Wap for a method with 2 parameter and with return type
class Sample2
{
	double sum(double num1,double num2){
		double res=num1+num2;
		return res;
		
	}
}
public class ThirdMethod {

	
	public static void main(String[] args) {
		Sample2 ob=new Sample2();
		double y=ob.sum(12, 14);
		System.out.println(y);
	
	}

}
