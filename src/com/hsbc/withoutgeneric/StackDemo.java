package com.hsbc.withoutgeneric;
import java.util.Stack;


public class StackDemo {
public static void main(String[] args) {
	Stack<Object> s1=new Stack<Object>();
	System.out.println(s1.capacity());
	s1.push("Bapun");
	s1.push("Parida");
//	s1.push(234);
//	s1.push(109);
	s1.push(new Integer(234));
	s1.push(new Integer(109));
//	s1.add("Rama");

	System.out.println(s1);
	System.out.println(s1.peek());
	//System.out.println(s1.pop());
	System.out.println(s1.search(new Integer(109)));
	System.out.println(s1.search(234));

	
}
}
