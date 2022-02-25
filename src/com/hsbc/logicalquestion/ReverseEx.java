package com.hsbc.logicalquestion;

public class ReverseEx {

    public static String revString(String source) {
        String str = "";
        if (source == null || source.isEmpty()) {

            return source;
        } else {
            for (int i = source.length() - 1; i >= 0; i--) {
                str = str + source.charAt(i);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String afterRverse = revString("Bhagabata");
        System.out.println(afterRverse);

    }
}
