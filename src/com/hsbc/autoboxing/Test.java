package com.hsbc.autoboxing;

public class Test {


    private void autoBoxingTest(int i) {

        System.out.println("i = " + i);
    }

    public static void main(String[] args) {

        Integer integer = new Integer(1);
        Test test = new Test();
        test.autoBoxingTest(integer);

    }
}
