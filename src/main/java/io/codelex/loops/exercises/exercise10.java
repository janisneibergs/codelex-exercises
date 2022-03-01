package io.codelex.loops.exercises;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Min? ");
        int min = input.nextInt();
        System.out.print("Min? ");
        int max = input.nextInt();
        for(int i = min; i<=max; i++) {
            for (int s = i; s <=max; s++) {

                System.out.print(s);
            }
            for(int k = 0; k<i-min; k++) {
                System.out.print(min+k);
            }

            System.out.println();
        }
    }
}
