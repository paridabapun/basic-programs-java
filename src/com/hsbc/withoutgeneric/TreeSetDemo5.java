package com.hsbc.withoutgeneric;
import java.util.TreeSet;


public class TreeSetDemo5 {
public static void main(String[] args) {
	TreeSet t1=new TreeSet(new MyComparatorString());
	t1.add("Rama");
	t1.add("Bhagabata");
	t1.add("geeta");
	t1.add(new StringBuffer("Bapun"));
	t1.add(new StringBuffer("kumar"));
	t1.add(new StringBuffer("Parida"));
	t1.add(new StringBuffer("Bhaga"));
	t1.add(new StringBuffer("Bapi"));
	System.out.println(t1);
}
}
