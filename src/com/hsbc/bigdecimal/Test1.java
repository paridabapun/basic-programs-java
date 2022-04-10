package com.hsbc.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {


    public static void main(String[] args) {


        final Map<String, Object> fxAmountMap = new HashMap<>();
        BigDecimal bigDecimal1, bigDecimal2;

        bigDecimal1 = new BigDecimal(1400.240000); // 1400.24
        bigDecimal2 = new BigDecimal(1450.0000000); // 1450


        //PROPOSED SOLUTION :

        System.out.println("---------------case--------------");
        bigDecimal1 = new BigDecimal("1400");
        bigDecimal2 = new BigDecimal("1234");
        if (bigDecimal1.scale() > 0) {
            fxAmountMap.put("amount", bigDecimal1.stripTrailingZeros().toPlainString());
            fxAmountMap.put("amount2", bigDecimal2.stripTrailingZeros().toPlainString());
            System.out.println("sfsfsf" + fxAmountMap.get("amount").getClass().getTypeName());
        } else {
            fxAmountMap.put("amount", new BigDecimal(bigDecimal1.stripTrailingZeros().toPlainString()));
            fxAmountMap.put("amount2", new BigDecimal(bigDecimal2.stripTrailingZeros().toPlainString()));
        }




       /* System.out.println("---------------CASE--------------");
        fxAmountMap.put("amount", bigDecimal1.stripTrailingZeros().setScale(2, RoundingMode.HALF_UP));
        fxAmountMap.put("amount2", bigDecimal1.stripTrailingZeros().setScale(2, RoundingMode.HALF_UP));*/

//        System.out.println("---------------CASE--------------");
//        fxAmountMap.put("amount", bigDecimal1.stripTrailingZeros());
//        fxAmountMap.put("amount2", bigDecimal2.stripTrailingZeros());


        System.out.println("amount  amount === " + fxAmountMap.get("amount"));
        System.out.println("amount  amount === " + fxAmountMap.get("amount2"));


    }
}