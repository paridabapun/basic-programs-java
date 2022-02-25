package com.hsbc.withoutgeneric;
import java.util.TreeSet;


public class TreeSetDemo {
public static void main(String[] args) {
TreeSet t1=new TreeSet();
System.out.println(t1.isEmpty());
System.out.println(t1.size());
t1.add(12);
t1.add(13);
t1.add(10);
t1.add(34);
t1.add(new Integer(15));
//t1.add("B");
//t1.add(null);
//t1.add(null);
System.out.println(t1);
}
}
