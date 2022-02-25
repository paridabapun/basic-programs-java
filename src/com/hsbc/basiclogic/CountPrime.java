package com.hsbc.basiclogic;

import java.io.*;

public class CountPrime {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter a number");
		int p=Integer.parseInt(br.readLine());
		int a=1,r;
		while(a<=p){
			int b=1,c=0;
			while(b<=a){
				{
					if(a%b==0)
						c=c+1;
					b++;
				}
				if(c==2)
					System.out.println(a);
				
			
				a++;
				
				
			}
		}
		
		
		}
	}

