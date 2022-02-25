package com.hsbc.basiclogic;//WAP to enter two no and check which is greater .....
import java.io.*;

public class BiggerNo {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the first  no");
		int fno=Integer.parseInt(br.readLine());
		
		System.out.println("enter the second no");
	int sno=Integer.parseInt(br.readLine());
	if(fno>sno){
		System.out.println(fno+" is greater");
	}
	else if(fno==sno){
		System.out.println("Both same");
		
	}
	else{
		System.out.println(sno+" is greater");
	}
	}

}
