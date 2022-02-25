package com.hsbc.mcqs;

public class MCQ5 {

    public static void main(String[] args) {
        System.out.println(getName());
    }

    public static String getName() {
        try {
            System.out.println("Inside Try...");
            System.exit(12);
            throw new NullPointerException("return value is null");
        } catch (Exception e) {
            throw new NullPointerException("return value is null");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }
}
