package com.hsbc.mcqs;


public class MyClass1 extends A {
    public static void main(String[] args) {
        // A a1=new A();
        // a1.funA();
        MyClass1 m1 = new MyClass1();
        boolean b1 = m1.getData();
        System.out.println(b1);

    }

    public boolean getData() {

        try {
            System.out.println("entering into try..");
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            // return false;
            System.out.println("hhhhh");
            return false;
        }
    }

}
