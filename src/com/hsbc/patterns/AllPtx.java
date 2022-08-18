package com.hsbc.patterns;

public class AllPtx {


    public static void pyramid() {


    }

    //LEFT TRIANGLE PATTERN
    public static void leftTriangle() {

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        leftTriangle();

    }
}
