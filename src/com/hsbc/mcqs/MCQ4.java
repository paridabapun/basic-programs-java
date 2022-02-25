package com.hsbc.mcqs;

public class MCQ4
{
    public static void main(String[] args)
    {
        System.out.println(getName());
    }

    public static String getName()
    {
        try {
            return "Mugil";
        } catch (Exception e) {
            throw new NullPointerException("return value is null");
        }finally {
            System.out.println("Finally Block Executed");
        }
    }
}