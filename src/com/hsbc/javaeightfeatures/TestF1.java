package com.hsbc.javaeightfeatures;


//Please closely check the code one tricky interview question
public class TestF1 {

    int x = 888;

    //    M2() using Annonymous class START
    public void m2() {

        InterF1 interF1 = new InterF1() {

            int x = 999;

            @Override
            public void m1() {
                System.out.println("Instance variable inside Inner Class/ lamda expression can declare instance variable");
                System.out.println(this.x);
            }
        };
        interF1.m1();
    }
    //    M2() using Annonymous class END


    //    M3() using LAMDA Expression class START
    public void m3() {
        int x = 1234;
        InterF1 interF1 = () -> {
            System.out.println("Inside Lamda Block");
            System.out.println(this.x);
        };
        interF1.m1();
    }
    //    M3() using LAMDA Expression class  END


    public static void main(String[] args) {

        TestF1 testF1 = new TestF1();
        testF1.m2();
        testF1.m3();
    }
}
/*
Annonymosu Inner class :
1.it is a class with out name.
2.Annonumous inner classes can extend Abstract classes and concreate clases


Lambda Expression :
1.It is function without name .
2.Lambda expression can't  extend Abstract classes and concreate clases
3.Lambda expression can implement only one interface(Interface only contain one abstract method(Functional interface))
3.
*/
