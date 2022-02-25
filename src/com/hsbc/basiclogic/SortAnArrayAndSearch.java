package com.hsbc.basiclogic;

import java.util.Arrays;

public class SortAnArrayAndSearch {
	public static void main(String[] args) {

		int array[]= {1,3,5,-9,-5,7,-1,0,8,-11,12,-4};
		
		printArray("Before Sort  ",array);
		Arrays.sort(array);
		printArray("After Sort", array);
		System.out.println(Arrays.binarySearch(array, 2));
		
		
		
	}
	private static void printArray(String message,int array[]) {
		System.out.println(message);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
			
		}
		System.out.println();
		
		
	}
}
