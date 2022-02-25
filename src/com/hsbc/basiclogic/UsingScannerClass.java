package com.hsbc.basiclogic;

import java.util.*;
public class UsingScannerClass {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,Salary");
		int id=sc.nextInt();
		String name=sc.next();
		double salary=sc.nextDouble();System.out.println("ID  ="+id);
		System.out.println("Name  ="+name);
		System.out.println("Salary  ="+salary);
		

	}

}
