package com.hsbc.exception;
class Demo 
{
	public static void main(String[] args) 
	{
		
		boolean flag=true;
		long x=0;
		while(flag){
			x=x+1;
			if(x>128){
			flag=false;
			}
			else{
			System.out.println("Wait....");
			}
		
		}
	

	System.out.println("x : "+x);
		}
	}

