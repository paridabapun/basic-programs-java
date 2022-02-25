package com.hsbc.logicalquestion;

import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String s = "";
        int ans = 0;
        while (number > 0) {

            int rem = number % 10;
            s = s + rem;
            number = number / 10;


        }
      /*  while (number > 0) {
            int rem = number % 10;
             number /= 10;
             ans = ans * 10 + rem;

        }*/
        System.out.println("Reverse of numberis " + s);

    }

}
