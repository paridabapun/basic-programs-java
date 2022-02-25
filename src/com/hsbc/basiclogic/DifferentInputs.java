package com.hsbc.basiclogic;
//Wap to accepting different inputs in a line
import java.io.*;
import java.util.*;
public class DifferentInputs {

	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name,age,salary:");
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str,",");
		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();
		s1=s1.trim();
		s2=s2.trim();
		s3=s3.trim();
		String name=s1;
		int age=Integer.parseInt(s2);
		double salary=Double.parseDouble(s3);
		System.out.println("name "+name);
		System.out.println("Age "+age);
System.out.println("Salary"+salary);		
		
	}

}
