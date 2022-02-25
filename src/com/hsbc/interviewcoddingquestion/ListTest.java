package com.hsbc.interviewcoddingquestion;

import java.util.ArrayList;

class ListTest {


    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Bapun");
        strings.add("Tutun");
        strings.add("Liza");
        strings.add("Bapun");
        strings.add("Bapun");
        System.out.println(strings);

        for (int i = 0; i < strings.size(); i++) {

        }

        for (String s : strings) {
                strings.remove("Liza");
                strings.remove("Tutun");


            }
        }


    }


