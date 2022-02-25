package com.hsbc.mcqs;

public class MCQ1 {

    public static void main(String[] args) {
        String s1 = new String("pankaj");
        String s2 = new String("PANKAJ");
        System.out.println(s1 = s2);

        String s3 = "abc";
        StringBuffer s4 = new StringBuffer(s3);
        System.out.println(s1.equals(s4));

        String s5 = "abc";
        String s6 = new String("abc");
        s6.intern();
        System.out.println(s5 == s6);

    }

}
