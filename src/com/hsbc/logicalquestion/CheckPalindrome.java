package com.hsbc.logicalquestion;

public class CheckPalindrome {


    public static void checkPalindrome(int number) {
        int rem = 0, sum = 0, temp;
        temp = number;
        while (number > 0) {

            rem = number % 10;
            sum = (sum * 10) + rem;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

    }


    public static void main(String args[]) {
        checkPalindrome(225);

    }
}
