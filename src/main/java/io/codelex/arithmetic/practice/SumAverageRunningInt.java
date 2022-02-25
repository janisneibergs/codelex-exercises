package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        double sum = 0;
        double average;
        int lowerBound = 1;
        double upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        int sumNoComa = (int)sum;
        average = sum / upperBound;
        System.out.println("The sum of "+lowerBound+" to "+upperBound+" is "+sumNoComa);
        System.out.println("The average is "+average);
    }
}
