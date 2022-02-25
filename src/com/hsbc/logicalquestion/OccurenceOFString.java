package com.hsbc.logicalquestion;

import java.util.HashMap;

public class OccurenceOFString {


    //Occurence of indivisual character.
    private static int findOccurence(String string, char c) {

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c)
                count++;
        }

        return count;
    }

    private static void findOccurenceofAll(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = s.toLowerCase().toCharArray();

        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);


    }


    public static void main(String[] args) {
        System.out.println(findOccurence("bhagabata", 'b'));
        findOccurenceofAll("bhagabata");

    }
}
