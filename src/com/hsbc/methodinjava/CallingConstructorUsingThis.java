package com.hsbc.methodinjava;

public class CallingConstructorUsingThis {
	int x=3;
	CallingConstructorUsingThis(){
		System.out.println("Default constructor called");
		System.out.println("VALUE OF X IS "+(x*x));
	}
	CallingConstructorUsingThis(int x){
		this();
		System.out.println("In parameterise constructor ");
	}

	
	public static void main(String[] args) {
		CallingConstructorUsingThis cc=new CallingConstructorUsingThis(55);
		
		

	}

}
