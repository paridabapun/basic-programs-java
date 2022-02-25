package com.hsbc.array;

public class Creating3DArray {

	public static void main(String[] args) {

		int dept, student, mark, tot = 0;
		int arr[][][] = { { { 50, 51, 55 }, { 45, 22, 55 } }, { { 77, 88, 99 }, { 44, 55, 22 } },
				{ { 15, 44, 25 }, { 25, 36, 14 } } };
		// display the mark of the 3D Array
		for (dept = 0; dept < 3; dept++) {
			System.out.println("Department " + (dept + 1) + ";  ");
			for (student = 0; student < 2; student++) {
				System.out.println("Student " + (student + 1) + "  marks:   ");
				for (mark = 0; mark < 3; mark++) {
					System.out.print(arr[dept][student][mark] + "  ");
					tot += arr[dept][student][mark];

				}
				System.out.println("Total   " + tot);
				tot = 0;
			}
			System.out.println();
		}
	}

}
