package com.hsbc.logicalquestion;

/*
 * THIS CLASS IS RESPONSIBLE FOR THE MATRIX OPERATION
 */
public class MatrixOperation {

	/*
	 * THIS METHOD IS RESPONSIBLE TO ADD TWO MATRIX
	 */
	public void addMatrix() {
		int a1[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 5, 6, 7 } };
		int a2[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 5, 6, 7 } };
		int sum[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("\t");
				sum[i][j] = a1[i][j] + a2[i][j];
				System.out.print(sum[i][j]);
			}
			System.out.println();

		}
	}

	/*
	 * THIS METHOD IS RESPONSIBLE TO SUBSTRACT TWO MATRIX
	 */
	public void substrMatrix() {
		int a1[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 5, 6, 7 } };
		int a2[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 5, 6, 7 } };
		int sum[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("\t");
				sum[i][j] = a1[i][j] - a2[i][j];
				System.out.print(sum[i][j]);
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		MatrixOperation matrixOperation = new MatrixOperation();
		System.out.println("Addition of two matrix ");
		matrixOperation.addMatrix();
		System.out.println("Substraction of two matrix ");
		matrixOperation.substrMatrix();
	}
}
