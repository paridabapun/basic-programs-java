package com.hsbc.array;
//wap TO display a 2D array as matrix
public class TWODMatrix {

	public static void main(String[] args) {
		int x[][] = { { 14, 12, 12, 15, 5 }, { 45, 55, 88, 65, 55 }, { 44, 11, 77, 88, 55 } };
		System.out.println("In matrix form");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
