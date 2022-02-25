package com.hsbc.basiclogic;

public class UndersatandingReturn {


	public static void main(String[] args) {
		int x=1;
		System.out.println("Before Return");
		if(x==1) 
			return;
//			System.exit(0);
		{
			System.out.println("After Return");
		}

	}

}
