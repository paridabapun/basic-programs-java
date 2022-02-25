package com.hsbc.basiclogic;//Wap toheck whether the no is a armstrong no or not
import java.io.*;
 


public class Armstrong {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n,t=0,s=0,r=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a positive no");
		n=Integer.parseInt(br.readLine());
		t=n;
		
		while(n>0){
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
			
		}
		if(t==s){
			System.out.println("It is a armstrong no");
		}else
			{
			System.out.println("it is not a armstromg no enter another");
			}
			
		}
}
		

