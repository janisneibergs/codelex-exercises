package io.codelex.typesandvariables.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        String a = "1";
        int b = 2;
        int c = 3;
        double d = 4;
        float e = 5;
        int aNumber = Integer.parseInt(a);

        //fixme - should be 15 :| 
        double sum = aNumber + b + c + d + e;
        System.out.println(sum);
    }

    private static void second() {
        String a = "1";
        int b = 2;
        int c = 3;
        double d = 4.2;
        float e = 5.3f;
        int aNumber = Integer.parseInt(a);


        //fixme - should be 15.5 :| 
        double sum = aNumber + b + c + d + e;
        BigDecimal bd = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
        sum = bd.doubleValue();
        System.out.println(sum);
    }
}
