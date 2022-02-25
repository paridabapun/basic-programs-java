package com.hsbc.methodinjava;

//Wap for a method without parameter and with return type
class Sample1{
	private double num1,num2;
	Sample1(double x,double y){
		num1=x;
		num2=y;
		
	}
	double sum(){
		double res=num1+num2;
		return res;
	}
}
public class SecondMethod {

	public static void main(String[] args) {
	Sample1 ob=new Sample1(11, 22);
	
		double x=ob.sum();
		System.out.println("sum is ="+x);
	

	}

}
