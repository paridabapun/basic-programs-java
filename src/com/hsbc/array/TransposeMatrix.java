package com.hsbc.array;
import java.util.*;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row,colomns?");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("Enter elements of the matrix");
		for (int i = 0; i < r; i++)

			for (int j = 0; j < c; j++)
				arr[i][j] = sc.nextInt();

		System.out.println("The transponse matrix :");

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {

				System.out.print(arr[j][i] + " ");
			}
			{
				System.out.println("\n");
			}
		}
	}
}
