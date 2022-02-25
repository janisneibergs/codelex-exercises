package io.codelex.typesandvariables.Exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double speedMetersSecond = 0;
        double speedKilometersHour = 0;
        double speedMilesHour = 0;
        System.out.print("Input distance in meters: ");
        String distance = myObj.nextLine();
        System.out.print("Input hour: ");
        String hour = myObj.nextLine();
        System.out.print("Input minutes: ");
        String minutes = myObj.nextLine();
        System.out.print("Input seconds: ");
        String seconds = myObj.nextLine();
        BigDecimal d = new BigDecimal(Integer.parseInt(distance));
        int h = Integer.parseInt(hour);
        int m = Integer.parseInt(minutes);
        int s = Integer.parseInt(seconds);
        m = m + (h * 60);
        BigDecimal secondsBig = new BigDecimal(s + (m * 60));

        BigDecimal constantKmh = new BigDecimal("3.6");
        BigDecimal constantMih = new BigDecimal("1.609344");
        BigDecimal ms = d.divide(secondsBig , 8, RoundingMode.HALF_EVEN);
        BigDecimal kmh = ms.multiply(constantKmh);
        BigDecimal mih = kmh.divide(constantMih, 8, RoundingMode.HALF_EVEN);

        System.out.println("Your speed in meters/second: " + (ms));
        System.out.println("Your speed in km/h: " + kmh);
        System.out.println("Your speed in miles/h: " + mih);





    }

}
