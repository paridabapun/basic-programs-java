package com.hsbc.mcqs;
//Deutche Bank
public class MCQ14 {
    public static void main(String[] args) {
        boolean flag = true;

        try {
            if (flag) {
                while (true)
                {
                    System.out.println("In while block");
                }
            } else {
                System.exit(1);

            }

        } finally {
            System.out.println("In Finally");
        }
    }
}
