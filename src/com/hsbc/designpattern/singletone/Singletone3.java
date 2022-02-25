package com.hsbc.designpattern.singletone;


public class Singletone3 {

    public static void main(String[] args) {

//Abc3 abc = Abc3.getInstance();
//Abc3 Abc3 = Abc3.getInstance();

//        System.out.println(abc+""+Abc3);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc3 abc = Abc3.getInstance();
            }
        });


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc3 abc3 = Abc3.getInstance();
            }
        });


        thread.start();
        thread1.start();


//SOMETIME IT WILL CREATE 2 OBJECT hence it fails making synchronize the method can solve the proble.. but there is a performance issue -- 1 ms will take 100 MS
    }


}
