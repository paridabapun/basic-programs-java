package com.hsbc.hackerrank;

import java.text.DecimalFormat;

public class PlusMinus {


    public static void main(String[] args) {


        int arr[] = {-4, 3, -9, 0, 4, 1};

        int evenFlagcount = 0;
        int oddFlagcount = 0;
        int zeroFlagcount = 0;

        for (int i = 0; i <= 5; i++) {

            if (arr[i] < 0) {
                evenFlagcount++;
            } else if (arr[0] > 0) {
                oddFlagcount++;
            } else {
                zeroFlagcount++;
            }


        }

        System.out.println("Flag values decide");

        System.out.println("evenFlagcount Ratio " + evenFlagcount);
        System.out.println("evenFlagcount Ratio" + oddFlagcount);
        System.out.println("evenFlagcount Ratio " + zeroFlagcount);
        System.out.println("Flag values decide");

        System.out.println("Ratio calculation");


        double v = evenFlagcount / 6;
        double v1 = oddFlagcount / 6;
        double v2 = zeroFlagcount / 6;



        DecimalFormat df= new DecimalFormat("#.000000");

        System.out.println("evenFlagcount " +df.format(v) );
        System.out.println("evenFlagcount " + df.format(v1));
        System.out.println("evenFlagcount " + df.format(v2));

//        System.out.println("Ratio calculation");

    }}
