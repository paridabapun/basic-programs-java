package com.hsbc.withgeneric;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;


public class SetImplLinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet<String> l1=new LinkedHashSet<String>();
	l1.add("B");
	l1.add("A");
	l1.add("p");
	l1.add("U");
	l1.add("N");l1.add("u");
	System.out.println(l1);
//	Collections.sort(l1);
List<String> l2=new ArrayList<String>(l1);
Collections.sort(l2);
Collections.reverse(l2);
System.out.println(l2);

}
}
