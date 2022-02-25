package com.hsbc.withoutgeneric;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ListTest {
	private static long addElement(List list,Long number)
	{
		long start=System.currentTimeMillis();
		for(int i=0;i<number;i++){
			list.add(0,i);
		}
		long end=System.currentTimeMillis();
		return end-start;
		
	}
public static void main(String[] args) {
	long count=10000;
	List arraylist=new ArrayList();
	long listtime=ListTest.addElement(arraylist, count);
	System.out.println("Time taken to add "+count+ " elements for arraylist "+listtime+"  milli-second");
	
	
	
	List linklist=new LinkedList();
	long linkttime=ListTest.addElement(linklist, count);
	System.out.println("Time taken to add "+count+ " elements for linklist "+linkttime+"  milli-second");
	
	
}
}
