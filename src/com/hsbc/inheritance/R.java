package com.hsbc.inheritance;

class R extends P 
{
	void funP(int x){
		int fact=1;
		  for(int i=1;i<=x;i++){
			fact=fact*i;
			}
			System.out.println("Factorial of "+x+" no's "+fact);
	}
	
}
