package com.hsbc.withoutgeneric;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class VectorDemo {
public static void main(String[] args) {
	Vector v1=new Vector();
	System.out.println(v1.capacity());
	v1.add("Bapunu");
	v1.add(123);
	v1.addElement("rama");
	v1.add("Bapunu");
	v1.add(123);
	v1.addElement("rama");
	v1.add("Bapunu");
	v1.add(123);
	v1.addElement("rama");
	v1.add("Bapunu");
	v1.add(123);
	v1.addElement("rama");
//	v1.addAll(v1);
	boolean b=v1.contains("rama");
System.out.println(b);
	System.out.println(v1);
System.out.println(v1.capacity());
System.out.println("++++++++++++++++++++++++++++++++++++");
Vector v2=new Vector();
for(int i=0;i<=10;i++){
	v2.add(i);
}
System.out.println(v2.capacity());
System.out.println(v2);
for(int i=1;i<v2.size();i++){
	System.out.println(v2.get(i));
}
//retrieve elements using Iterator

System.out.println("retrieve elements using Iterator");
Iterator it=v2.iterator();
while (it.hasNext()) {
	Integer it1 = (Integer) it.next();
	System.out.println(it1);
	
}
//iterate using ListIterator
System.out.println("iterate using ListIterator");

ListIterator lit=v2.listIterator();
while (lit.hasPrevious()) {
	System.out.println(lit.previous());
	Object object = (Object) lit.previous();
	System.out.println(object);
}
//iterate using Enumeration

Enumeration e1=v2.elements();
System.out.println("iterate using Enumeration");
while (e1.hasMoreElements()) {
	Object object = (Object) e1.nextElement();
	System.out.println(object);
}

}
}
