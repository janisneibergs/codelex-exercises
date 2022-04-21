package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter number: ");
        String num = number.nextLine();
        int x = 0;
        while (num.length() > 1) {
            sum = 0;
            List<String> listNumber = new ArrayList<String>(Arrays.asList(num.split("")));
            for (int i = 0; i < listNumber.size() - 1; i++) {
                x = Integer.valueOf(listNumber.get(i));
                sum = sum + x * x;
                System.out.print(x + "^2 + ");
            }
            x = Integer.valueOf(listNumber.get(listNumber.size() - 1));
            sum = sum + x * x;
            System.out.print(x + "^2");
            System.out.println(" = " + sum);
            num = String.valueOf(sum);
        }

        if (sum == 1) System.out.println("Is happy number ");
        else System.out.println("Is not happy number");
    }
}
