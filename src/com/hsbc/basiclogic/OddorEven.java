package com.hsbc.basiclogic;//WAP to check a no is even or odd
import java.io.*;
public class OddorEven {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a no to check");
		int n=Integer.parseInt(br.readLine());
		if(n%2==0){
			System.out.println(n+" is even");
		}
		else{
			System.out.println(n+" is odd");
		}
		
	
	}

}
