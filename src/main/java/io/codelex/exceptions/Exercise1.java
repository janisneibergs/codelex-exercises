package io.codelex.exceptions;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        while (quit) {
            System.out.println("Enter the numerator");
            String numerator = scanner.nextLine();
            if (numerator.equals("q") || numerator.equals("Q")) {
                break;
            }
            System.out.println("Enter the divisor");
            String divisor = scanner.nextLine();

            try {
                int number = Integer.parseInt(numerator);
                int div = Integer.parseInt(divisor);
                try {
                    System.out.println(number + " / " + div + " = " + number / div);
                } catch (ArithmeticException e) {
                    System.out.println("You can't divide " + number + " by 0");
                }
            } catch (NumberFormatException ex) {
                System.out.println("You entered bad data.");
                ;
            }


        }
    }
}
