package com.hsbc.basiclogic;

import java.io.*;
public class ArmstrongNo {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no to check the no armstrong or not");
		int n=Integer.parseInt(br.readLine());
		int t,s=0,r;
		t=n;
		while(n>0){
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
		}
		if(t==s){
			System.out.println(t+" is a armstrong no ");
		}
		else {
			System.out.println(t+" Not a armstrong no");
		}
		
		

	}

}
