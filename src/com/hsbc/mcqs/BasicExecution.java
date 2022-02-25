package com.hsbc.mcqs;

public class BasicExecution {

    static int y = 5;

    static {
        int y = 7;
        String name = "Bapunu";
        System.out.println("Static block executed..");

    }

    public int x = 7;

    {
        int y = 7;
        String name = "Bapunu";
        System.out.println("instance  block executed..");
    }

    BasicExecution() {

        System.out.println("o arg constructor executed.......");
    }

    public static void main(String[] args) {
        BasicExecution bex = new BasicExecution();
        System.out.println();

    }
}
