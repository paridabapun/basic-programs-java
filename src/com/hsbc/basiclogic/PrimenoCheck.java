package com.hsbc.basiclogic;

import java.io.*;


public class PrimenoCheck {


	public static void main(String[] args) throws Exception {
		int a,b=1,c=0;
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter a no");
		a=Integer.parseInt(br.readLine());
		while(b<=a)
		{
			if(a%b==0)
			{
				c=c+1;
			}
		b++;
		}
		if(c==2){
			System.out.println(a+" is a prime no");
			
		}
		else
		{
			System.out.println(a+"  is not a prime no");
		}
		
		

	}

}
