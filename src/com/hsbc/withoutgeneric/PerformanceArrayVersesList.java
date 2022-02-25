package com.hsbc.withoutgeneric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.hsbc.cache.Company;

public class PerformanceArrayVersesList {
	public static void main(String[] args) {
		Company company;
	    // CHEKICNG PERFORMANCE OF ARRAYLIST VERSES ARRAY START
		Company nameArrray[] = new Company[100000];
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < nameArrray.length; i++) {
			company = new Company();
			company.setId("id" + i);
			company.setBillType("billType"+i);
			nameArrray[i]=company;
		}
		System.out.println(nameArrray.length);
		long endTime = System.currentTimeMillis();
		System.out.println("Time Taken for Array" + (startTime - endTime));

		ArrayList<Company> nameList = new ArrayList<Company>();
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			company = new Company();
			company.setId("id" + i);
		nameList.add(company);
		}
		System.out.println(nameList.size());
		endTime = System.currentTimeMillis();
		System.out.println("Time Taken for List" + (startTime - endTime));
	    /* CHEKICNG PERFORMANCE OF ARRAYLIST VERSES ARRAY END */
		
		System.out.println("Iteration Test Stated");
		ArrayList<Company> compArray=new ArrayList<Company>();
		
		
		for(int i=0;i<20;i++) {
			company=new Company();
			company.setBillType("billType"+i);
			company.setId("id"+i);
			compArray.add(company);
		}
		ListIterator<Company> listIterator=compArray.listIterator();
		System.out.println("ListIteration in forward direction");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("ListIteration In Backward Direction");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("Iterator in only in Forard Direction");
		Iterator<Company> iterator=compArray.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	
}
