package com.hsbc.oops;
class Odemo12 
{
	int getSqr(int x){
	int result=x*x;
	return result;
	
	}
	public static void main(String[] args) 
	{
Odemo12 dq=new Odemo12();
int x=dq.getSqr(10);//calling place
System.out.println(x);
	}
}
