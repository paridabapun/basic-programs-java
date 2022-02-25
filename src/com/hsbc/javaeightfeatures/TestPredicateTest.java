package com.hsbc.javaeightfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestPredicateTest {

    public static void main(String[] args) {


        Function<String, Integer> stringFunction = s -> s.length() - s.replaceAll(" ", "").length();

        Function<String , String>  stringFunction1 = s -> s.replaceAll(" ", "");



        String s2 = "My Name is  bhagabata Parida";
        System.out.println(stringFunction.apply(s2));

        System.out.println(stringFunction1.apply(s2));

    }
}
