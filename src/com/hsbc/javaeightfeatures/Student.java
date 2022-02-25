package com.hsbc.javaeightfeatures;

import java.util.ArrayList;
import java.util.function.Function;

public class Student {

    private String names;
    private int marks;


    public Student(String names, int marks) {
        this.names = names;
        this.marks = marks;
    }

    public static void populate(ArrayList<Student> arrayList) {
        arrayList.add(new Student("Bapun", 40));
        arrayList.add(new Student("Liza", 70));
        arrayList.add(new Student("Papun", 50));
        arrayList.add(new Student("Tutun", 55));
        arrayList.add(new Student("Sipun", 28));
        arrayList.add(new Student("Bapi", 90));


    }

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        populate(arrayList);

        Function<Student, String> studentStringFunction = s -> {
            int marks = s.marks;
            if (marks >= 80) {
                return "A ";
            } else if (marks >= 60) {
                return "B ";

            } else if (marks >= 50) {
                return "C ";

            } else if (marks >= 35) {
                return "D ";

            } else {
                return "F ";
            }
        };
        for (Student student : arrayList) {
            System.out.println("Student Name " + student.names);
            System.out.println("Student Marks " + student.marks);
            System.out.println("Student Grade " + studentStringFunction.apply(student));

        }
    }
}
