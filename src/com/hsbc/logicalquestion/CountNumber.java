package com.hsbc.logicalquestion;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumber {


    //FAULTY in PROGRAM
    public static void main(String[] args) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String s = number + "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);


            } else {
                map.put(chars[i], 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

    }
}
