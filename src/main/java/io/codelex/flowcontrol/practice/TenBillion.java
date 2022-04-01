package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        Long n = in.nextLong();
        int digits = 0;
        if (n > 10000000000L) {
            System.out.println("Number is greater than 10,000,000,000!");
        } else {
            if (n <= 99) {
                digits = 2;
            } else if (n <= 999) {
                digits = 3;
            } else if (n <= 9999) {
                digits = 4;
            } else if (n <= 99999) {
                digits = 5;
            } else if (n <= 999999) {
                digits = 6;
            } else if (n <= 9999999) {
                digits = 7;
            } else if (n <= 99999999) {
                digits = 8;
            } else if (n <= 999999999) {
                digits = 9;
            } else if (n == 10000000000L) {
                digits = 10;
            }
            System.out.println("Number of digits in the number: " + digits);
        }
    }

}


