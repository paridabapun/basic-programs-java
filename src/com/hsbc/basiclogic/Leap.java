package com.hsbc.basiclogic;

import java.io.*;
public class Leap {

	
	public static void main(String[] args)throws Exception {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the year to check for leap ");
int year=Integer.parseInt(br.readLine());
if(year%100==0 && year % 400==0){
	System.out.println(year+" is a leap year");
}
else if(year % 100!=0 && year % 4==0){
	System.out.println(year+" is a leap year");
}
else{
	System.out.println(year+" not a leap year");
}
	}

}
