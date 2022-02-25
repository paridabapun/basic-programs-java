package com.hsbc.basiclogic;//wap to read a character and detemine whether the enter character is an alphabet or numeric or special symbol
import java.io.*;
public class CheckWhat {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character");
		
		char x=(char)br.read();
		if(x>='0'&& x<='9'){
			System.out.println(x+" is number");
			
		}
		else if((x>='A'&& x<='Z')||(x>='a' && x<='z')){
			System.out.println("It is an alphabet");
			
		}
		else{
			System.out.println("special character");
		}

	}

}
