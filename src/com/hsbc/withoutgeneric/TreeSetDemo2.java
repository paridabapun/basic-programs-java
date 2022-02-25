package com.hsbc.withoutgeneric;
import java.util.HashSet;
import java.util.TreeSet;


public class TreeSetDemo2 {
public static void main(String[] args) {
TreeSet t1=new TreeSet(new MyComparator1());
t1.add(10);
t1.add(0);
t1.add(15);
t1.add(5);
t1.add(20);
System.out.println(t1);

}
}
