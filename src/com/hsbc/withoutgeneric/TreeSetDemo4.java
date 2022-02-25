package com.hsbc.withoutgeneric;
import java.util.TreeSet;


public class TreeSetDemo4 {
public static void main(String[] args) {
	TreeSet t1=new TreeSet(new MyComparatorString());
	t1.add("Bapun");
	t1.add("kumar");
	t1.add("Parida");
	t1.add("Bhaga");
	t1.add("Bapi");
	System.out.println(t1);
}
}
