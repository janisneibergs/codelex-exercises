package io.codelex.loops.exercises;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size of figure: ");
        int count = input.nextInt();
        int const1 = 8;
        int const2 = 4;

        for (int s = 0; s < count; s++) {
            for (int i = 1; i <= count * const1; i++) {
                int line = s * const2 - 1;
                if (i < count * const2 - line) {
                    System.out.print("/");

                } else if (i > count * const2 + line + 1) {
                    System.out.print("\\");

                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
