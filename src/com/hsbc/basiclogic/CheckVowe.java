package com.hsbc.basiclogic;

import java.io.*;

public class CheckVowe {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a character");
	
		char c=(char)br.read();
		switch (c) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':case 'o':
		case 'O':
		case 'u':
		case 'U':
		
			System.out.println("Is a Vowels");
			
			break;

		default:System.out.println("is a consonate");
			break;
		}
	

	}

}
