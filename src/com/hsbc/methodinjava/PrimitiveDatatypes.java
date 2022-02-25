package com.hsbc.methodinjava;

//WAP to pass primitive data to amethod and perform a swap operation will held or not
public class PrimitiveDatatypes {
	void swap(int num1,int num2){
		int temp;
		temp=num1;
		num1=num2;
		num1=temp;
		
	}
	

	
	public static void main(String[] args) {
	PrimitiveDatatypes pd=new PrimitiveDatatypes();
	int num1=10,num2=20;
	System.out.println("The value of num1 before swap "+num1);
	System.out.println("The value of num2 before swap "+num2);
	pd.swap(num1, num2);//this is call pass by value or call by value
	System.out.println("The value of num1 after swap "+num1);
	System.out.println("The value of num2 after swap "+num2);
	}

}
