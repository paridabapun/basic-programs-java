package com.hsbc.mcqs;
public class MCQ3 {
//Tricky really ..
    public static void main(String[] args) {
        try {
            String s1 = null;
            s1.toString();
            System.out.println("Try ......");
        }
             finally {
            System.out.println("When finally block will execute ?");
        }
    }
}
