package com.hsbc.mcqs;

public class ExceptionTest {
    public static void main(String[] args) {

        ExceptionTest e1 = new ExceptionTest();
        String abc = e1.m1();
        System.out.println(abc);

        try {
            System.out.println("try use");
            A a1 = null;
            // a1.equals(a1);
            // return ;
            // a1.equals(a1);

            System.exit(0);
        } catch (ArithmeticException ae) {
            System.out.println("ARE");
        } catch (RuntimeException rex) {
            System.out.println("REX");
        } catch (Exception e) {
            System.out.println("Exc");
        } finally {
            System.out.println("Finally Executed");

        }

    }

    public String m1() {
        try {
            return "Bapunu1";
        } catch (Exception ae) {
            System.out.println("obj method...");
        } finally {
            System.out.println("Finally Executed of m1");
        }
        return "Abc";
    }
}
