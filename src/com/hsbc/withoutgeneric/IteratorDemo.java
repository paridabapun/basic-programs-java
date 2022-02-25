package com.hsbc.withoutgeneric;
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	
		
	for(int i=0;i<10;i++){
		a1.add(i);
		
	}
	System.out.println(a1);
	Iterator it=a1.iterator();

	while(it.hasNext()){
		Integer ing=(Integer)it.next();
		System.out.println(ing);
}
	
		
	}
	}
