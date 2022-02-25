package com.hsbc.praveen;
import java.io.*;
public class Armstrong
{
	public static void main (String args[])throws Exception
	{
		int n,t,s=0,r=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		n=Integer.parseInt(br.readLine());
	t=n;
		while(n>0)
		{
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
		}
		if(t==s)
			System.out.println("Armstrong no is  "+t);
		else
			System.out.println("Not a Armstrong no   "+t);
	}
	}