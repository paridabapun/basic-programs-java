package com.hsbc.basiclogic;

import java.io.*;

public class CheckNo {

	
	public static void main(String[] args)throws Exception {
/*	int num=-4;
	if(num==0)
		System.out.println("This is Zero Enter Agin........");
	else if(num<0)
		System.out.println(num+" is negetive no ");
	else System.out.println(num+" is positive no ");

	}

}*/
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no to check ");
		int num=Integer.parseInt(br.readLine());
		
		if(num==0)
			System.out.println("This is Zero Enter Agin........");
		else if(num<0)
			System.out.println(num+" is negetive no ");
		else System.out.println(num+" is positive no ");

	}
	}
