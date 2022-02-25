package com.hsbc.designpattern.singletone;


public class Singletone {

    public static void main(String[] args) {

//Abc2 abc = Abc2.getInstance();
//Abc2 Abc2 = Abc2.getInstance();

//        System.out.println(abc+""+Abc2);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc2 abc = Abc2.getInstance();
            }
        });


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc2 abc2 = Abc2.getInstance();
            }
        });


        thread.start();
        thread1.start();


//SOMETIME IT WILL CREATE 2 OBJECT hence it fails making synchronize the method can solve the proble.. but there is a performance issue -- 1 ms will take 100 MS
    }


}
