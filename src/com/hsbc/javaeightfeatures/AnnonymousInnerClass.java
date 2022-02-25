package com.hsbc.javaeightfeatures;

public class AnnonymousInnerClass {

    public static void main(String[] args) {


//        Runnable  runnable  = () -> {"Run Method"};

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Child thread");
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        for (int j = 0; j < 15; j++) {
            System.out.println("Main Thread");
        }


//        USING LAMDA EXPRESSION

        Runnable runnable1 = () -> {
            for (int i = 0; i < 15; i++) {
                System.out.println("Lamda Child Thread");
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                System.out.println("inside Lamda Child Thread");
            }
        });
        thread2.start();


    }
}
