package com.hsbc.array;
import java.io.*;

public class PerformOperation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of subjects");
		int n = Integer.parseInt(br.readLine());
		int marks[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Marks");
			marks[i] = Integer.parseInt(br.readLine());

		}
		int tot = 0;
		for (int i = 0; i < n; i++) {
			tot += marks[i];
		}
		float percent = (float) tot / n;
		System.out.println("tOTAL mARK wILL bE  " + tot);
		System.out.println("Pecentage of student is   " + percent);

	}

}
