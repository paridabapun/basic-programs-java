package com.hsbc.basiclogic;//WAP  for swapping of two no using third variable
import java.io.*;
public class SwapingNo {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of  a ");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of b ");
		int b=Integer.parseInt(br.readLine());
		System.out.println("The value of  a  before swapping is  "+a);
System.out.println("The value of b before swapping is "+b);
int c;
c=a;
a=b;
b=c;
System.out.println("---------------After operation completed ---------------");
System.out.println("The value of  a  after swapping is  "+a);
System.out.println("The value of b after swapping is "+b);

			
	}

}
