package com.hsbc.basiclogic;

public class StarPrintingReverse {

	public static void main(String[] args) {
	int row=0;
	for(int i=4;i>=row;i--)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print("   * ");
		}
		System.out.println();
	}
	}
	}
