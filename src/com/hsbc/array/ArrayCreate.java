package com.hsbc.array;
import java.util.Calendar;
import java.util.Date;

//WAP to create a 1D array read its element using a loop display one by one
public class ArrayCreate {

	public static void main(String[] args) {

		int marks[] = { 10, 20, 30, 40, 50 };
		/*
		 * for(int i=0;i<5;i++) { System.out.println(marks[i]); }
		 */
		for (int i : marks) {
			System.out.print("\t" + i);
		}

		System.out.println("\n" + "Second Loop started");

		for (int i = 0; i < marks.length; i++) {
			System.out.print("\t" + marks[i]);
		}

	}

}
