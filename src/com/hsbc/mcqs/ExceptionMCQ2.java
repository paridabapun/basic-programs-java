package com.hsbc.mcqs;

public class ExceptionMCQ2 {

    public static void main(String[] args) {


        try {
            System.out.println(args[0]);
        } catch (Exception exception) {
            System.out.println("Exception Caught");
        }
    }
}
