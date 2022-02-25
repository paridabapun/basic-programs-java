package com.hsbc.javaeightfeatures;

import javax.sound.midi.Soundbank;

public class DoubleCollon {

    public static void m2() {

        System.out.println("Method Reference of ");
    }

    public static void m3() {

        System.out.println("Method Reference of m3 ");
    }

    void m4(){

    }

    public static void main(String[] args) {

        DoubleColInterface interf = () -> {

            System.out.println("Inside Lambda expression ");
            System.out.println(5+4);
        };
        interf.m1();

        DoubleColInterface doubleColInterface = DoubleCollon :: m3;
        doubleColInterface.m1();


    }
}
