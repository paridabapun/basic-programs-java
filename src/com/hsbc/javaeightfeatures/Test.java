package com.hsbc.javaeightfeatures;

public class Test {


   /*
   //WITHOUT LAMDA EXPRESSION
    public static void main(String[] args) {

        Interf interf = new Demo();
        interf.sum(7, 3);


    }*/

    //WITH LAMDA EXPRESSIION
    public static void main(String[] args) {

       /* Interf interf = (a, b) -> System.out.println("Sum of a + b  is " + (a + b));
        interf.sum(1, 2);
        interf.sum(3, 6);*/

      /*  Interf interf = (String s) ->{return  s.length();
        };*/
/*
        Interf interf = s -> s.length();
        System.out.println( interf.getlength("Bapun"));
        System.out.println(interf.getlength("Bapun+Liza"));*/

Interf interf = x -> x*x;
        System.out.println(interf.getSquare(10));

    }

}



