package com.hsbc.javaeightfeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterface {

    public static void main(String[] args) {


        Function<String, Integer> stringIntegerFunction = s -> s.length();
        System.out.println(stringIntegerFunction.apply("Bhagabata"));

        Function<Integer, Integer> integerIntegerFunction = i -> i * i * i;
        System.out.println(integerIntegerFunction.apply(3));

        String string = "My Name is Bhgabata Parida";
        Function<String, String> stringStringFunction = s -> s.replaceAll(" ", "");
        System.out.println(stringStringFunction.apply(string));


    }
}
