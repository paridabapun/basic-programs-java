package com.hsbc.basiclogic;

import java.io.*;

public class PrimeNo {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a no to check prime or not");
		int p=Integer.parseInt(br.readLine());
		int a=1,c=0;
		while(a<=p){
			if(p%a==0){
				
			c=c+1;	
			}
			a++;
		}
		
		
		if(c==2){
			System.out.println(p+" is a prime no");
		}
		else{
			System.out.println(p+"  is not  a prime no");
		}
	}

}
