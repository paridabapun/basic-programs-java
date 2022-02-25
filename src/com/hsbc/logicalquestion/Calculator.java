package com.hsbc.logicalquestion;

import com.hsbc.javaeightfeatures.Scaler;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter operation ");

        char operation = scanner.next().charAt(0);

        if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%') {
            System.out.println("Enter two number please to perform the " + operation);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();


            if (operation == '+') {
                System.out.println("Sum of two no is " + (num1 + num2));
            } else if (operation == '-') {
                System.out.println("Minus of two no is " + (num1 - num2));
            } else if (operation == '*') {
                System.out.println("Mul of two no is " + num1 * num2);
            } else if (operation == '/') {
                System.out.println("Div of two no is " + num1 / num2);
            } else {
                System.out.println("Modular of two no is " + num1 % num2);
            }


        } else {
            System.out.println("Please enter valid operation--  Operation not supported");
            System.exit(0);
        }


    }

}
