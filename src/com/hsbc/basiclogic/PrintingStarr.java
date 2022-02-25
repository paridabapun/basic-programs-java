package com.hsbc.basiclogic;

import java.io.*;

public class PrintingStarr {

	
	public static void main(String[] args)throws IOException {
	/*	int r=15;
		for(int i=1;i<=r;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println("");
		}*/
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number of integer to print");
		int r=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=r;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ** ");
				//System.out.print("1 ");
			}
			System.out.println();
		
		
	}
	}}


