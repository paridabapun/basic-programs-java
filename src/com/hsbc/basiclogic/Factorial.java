package com.hsbc.basiclogic;

import java.io.*;
public class Factorial {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a no to find factoria ");
		int n=Integer.parseInt(br.readLine());
		int t,f=1;
		t=n;
		while(n>0){
			f=f*n;
			n--;
		}
System.out.println("Factorial of  "+t+" is "+f);
	}

}
