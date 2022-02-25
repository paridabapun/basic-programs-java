package com.hsbc.basiclogic;//wap for swapping of two no without using third variable
import java.io.*;

public class SwappingNo {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of  a ");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of b ");
		int b=Integer.parseInt(br.readLine());
		System.out.println("The value of  a  before swapping is  "+a);
System.out.println("The value of b before swapping is "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("---------------After operation completed ---------------");
System.out.println("The value of  a  after swapping is  "+a);
System.out.println("The value of b after swapping is "+b);

	}

}
