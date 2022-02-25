package com.hsbc.mcqs;

public class MCQ15 {
    public int aMethod(){
//        static int i =0;
         int i =0;
        i++;
        return  i;
    }

    public static void main(String[] args) {

        MCQ15 mcq15=new MCQ15();
        mcq15.aMethod();
        int j=mcq15.aMethod();
        System.out.println(j);
    }
}
