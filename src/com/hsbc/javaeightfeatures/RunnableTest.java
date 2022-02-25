package com.hsbc.javaeightfeatures;

public class RunnableTest {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i <= 50; i++)
                System.out.println("Child Thread");
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
