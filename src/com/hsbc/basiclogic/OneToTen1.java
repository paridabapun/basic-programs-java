package com.hsbc.basiclogic;//wap to take input from keyboard to print numbers
import java.io.*;


public class OneToTen1 {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter starting numbers to print");
		int s=Integer.parseInt(br.readLine());
		System.out.println("Enter Ending number to ");
		int e=Integer.parseInt(br.readLine());
		if(s<=e){
			System.out.println("follow these");
			
		}
		else{
			System.out.println("Starting number is greater then the ending leter please try again ....... ");
		}
while (s<=e) {
	System.out.println("\n"+s);
	s++;
}


	}

}
