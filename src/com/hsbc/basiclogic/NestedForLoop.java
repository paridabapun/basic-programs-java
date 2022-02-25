package com.hsbc.basiclogic;

public class NestedForLoop {

	
	public static void main(String[] args) {
	for(int x=1;x<=4;x++){
		System.out.println("value of x is  " +x );
		for(int y=1;y<=10;y++){
			System.out.println("inner loop continue " +y);
		}
	}

	}

}
