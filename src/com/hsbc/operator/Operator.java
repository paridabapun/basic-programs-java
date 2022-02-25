package com.hsbc.operator;

public class Operator {

	
	public static void main(String[] args) {
		int i=5;
		int j=7;
		
		//int z=j++ + ++i;
		 //int z=++j - j++ + --i + j-- + ++i;
		 int z=(i++)-(--i)-(++j)+(j--)-(++i)+(j++);
		 
		 
		 // 
		 System.out.println(z);
		// j=++j;
		//System.out.println(j);
		//int i=5;
		//int j=6;
	
		//int z=(i++)+(j++)-(--i)-(--j)-(j++)-(++i)+(++j)-(j--)-(i--);
		System.out.println(z);

	}

}
