package com.hsbc.basiclogic;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some string");
	String text=sc.nextLine();
	
	char[] textarray=text.toCharArray();
	HashSet<Character> orghash=new HashSet<>();
	for(Character c : textarray) {
		orghash.add(c);
	}
	System.out.println(orghash);
	}

}
