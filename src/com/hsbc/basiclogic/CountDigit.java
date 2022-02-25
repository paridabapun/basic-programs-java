package com.hsbc.basiclogic;//Wap to cont the digit of a given no.....
import java.io.*;
public class CountDigit {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a no");
	
		long n=Long.parseLong(br.readLine());
		
		int count=0;
		while(n>0){
			n=n/10;
			count++;
		}
		System.out.println("No of digit entered  "+count);
	

	}

}
