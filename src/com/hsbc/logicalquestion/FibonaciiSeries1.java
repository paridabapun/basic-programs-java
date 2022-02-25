package com.hsbc.logicalquestion;

import com.hsbc.basiclogic.Fibonacci;

import java.util.Scanner;

public class FibonaciiSeries1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int first_num = 0;
        int second_num = 1;
        int third_num = 0;
        System.out.println("Fibonacci number till " + number);
        System.out.print(first_num + " , " + second_num + " ");

        for (int i = 0; i < number; i++) {

            third_num = first_num + second_num;
            first_num = second_num;
            second_num = third_num;

            System.out.print(" ,"+third_num);


        }

    }
}
