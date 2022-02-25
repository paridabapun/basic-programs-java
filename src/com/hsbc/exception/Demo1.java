package com.hsbc.exception;
class Demo1 
{
	public static void main(String[] args) 
	{
		
		boolean flag=true;
		long x=0;
		while(true){
			x=x+1;
			if(x>128){
			flag=false;
			}
			else{
			System.out.println("Wait....");
			}
		
		}

//	System.out.println("x : "+x);//unreachable statement
		}
	}

