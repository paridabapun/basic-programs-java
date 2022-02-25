package com.hsbc.withgeneric;
//WAp to sort the elements of an List using custom sorting order
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ArrayListDemo1 {
public static void main(String[] args) {
	ArrayList<String> l1=new ArrayList<String>();
l1.add("B");	
l1.add("Z");	
l1.add("A");
l1.add("BA");	
l1.add("ZP");
l1.add("AA");
System.out.println(l1);
Collections.sort(l1, new Comparator<String>() {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
		}
});
System.out.println("\n"+"After Sorting....."+l1);
//System.out.println("\n"+"Reverse Sorting ..."+l1 );//(- symbols)
System.out.println("Searching the elements............");
System.out.println(Collections.binarySearch(l1, "ZP"));
//System.out.println(Collections.binarySearch(l1, "gd"));
Collections.reverse(l1);
System.out.println(l1);
}
}
