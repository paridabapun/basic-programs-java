package com.hsbc.logicalquestion;

import static java.lang.System.out;

public class StringPalindrome {

    public static void checkPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        String s1 = stringBuffer.reverse().toString();
        if (s1.equalsIgnoreCase(s)) {
            out.println("Palindrome");
        } else {
            out.println("not Palindrome");
        }
    }


    public static void main(String[] args) {
        checkPalindrome("aba");
    }

}
