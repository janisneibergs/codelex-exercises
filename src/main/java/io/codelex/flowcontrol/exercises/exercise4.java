package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write number of day starting from 0: ");

        int dayNumber = (int) in.nextLong();
        switch (dayNumber) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 60:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
