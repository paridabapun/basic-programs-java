package com.hsbc.withgeneric;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(4);a1.add(3);
		a1.add(7);a1.add(4);
		a1.add(9);a1.add(5);
		a1.add(9);a1.add(6);
		System.out.println(a1);
		
		Collections.sort(a1);
		Collections.sort(a1, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
			if(i1>i2){
				return +1;
			}
			else if(i1<i2){
				return -1;
			}
			else{
				return 0;
			}
			}
			
		
		
		});
		System.out.println(a1);

	}

}
