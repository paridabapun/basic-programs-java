package com.hsbc.withoutgeneric;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {
public static void main(String[] args) {
	LinkedHashSet l1=new LinkedHashSet();
	l1.add("B");
	l1.add("A");
	l1.add("p");
	l1.add("U");
	l1.add("N");l1.add("u");
	System.out.println(l1.add("u"));
	l1.add(123);
	System.out.println(l1);
}
}
