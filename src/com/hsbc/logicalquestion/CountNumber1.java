package com.hsbc.logicalquestion;

import java.util.Scanner;

public class CountNumber1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        while (n > 0) {

            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("the count of 5 is  "+count);

    }
}
