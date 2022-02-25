package com.hsbc.logicalquestion;

import java.util.Scanner;

public class UpperCaseLowerCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if ((ch <= 'z') && (ch >= 'a')) {
            System.out.println("" + ch + "  is  Lower CASE");
        } else {
            System.out.println("" + ch + "  is  UPPER  CASE");
        }
    }
}
