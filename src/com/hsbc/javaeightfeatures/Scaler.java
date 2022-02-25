package com.hsbc.javaeightfeatures;

public class Scaler {


    public static int fib(int n) {
        if (n <= 1) {
            return n;

        }
        return fib(n - 1) + fib(n - 2);
    }


    static int printTribRec(int n) {

        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        if (n == 3) {
            return 1;

        } else {
            return printTribRec(n - 1) + printTribRec(n - 2) + printTribRec(n - 3);

        }
    }

    static void printTrib(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(printTribRec(i) + " ");
        }
    }

    public static int fun(int A, int B) {

        if (B == 0) {
            return A;
        } else {
            return fun(B, A % B);
        }
    }

    public static void main() {
        int ans = fun(100, 2000);
        System.out.println(ans);
    }

    public static void main(String[] args) {

        main();

        int y = fib(6);

        System.out.println(y);

        printTrib(6);
        int i = 0;

        int sum = 0;

        while (i < 100) {

            sum = sum + 1;
            sum = i + sum;
            i += 1;
        }
        System.out.println(sum);
    }
}
