package com.hsbc.methodinjava;

import java.text.*;


public class FactoryMethod1 {

	
	public static void main(String[] args) {
	final double PI=(double)22/7;
	double r=15.7;
	double area=PI*r*r;
	System.out.println("Area ="+area);
	NumberFormat ob=NumberFormat.getNumberInstance();
	ob.setMaximumFractionDigits(2);
	ob.setMinimumIntegerDigits(3);
	String str=ob.format(area);
	System.out.println("formatted area is "+str);
	}

}
