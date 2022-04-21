package io.codelex.arrays.practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise2 {

    //TODO: Write a Java program to sum values of an array.
    // Array values are starting from min (including) till max (including) number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int[] myArray = new int[maxNumber-minNumber+1];
        int sum = 0;
        int i = 0;

            for(int k=minNumber; k<=maxNumber; k++){

                myArray[i] = k;
              i++;
        }
        sum = IntStream.of(myArray).sum();



        System.out.println("The sum is " + sum);
    }
}
