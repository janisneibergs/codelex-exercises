package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Desire sum: ");
        int userSum = input.nextInt();
        int randomSum = 0;



        while(userSum != randomSum ) {
            int r1 = rand.nextInt(5)+1;
            int r2 = rand.nextInt(5)+1;
            randomSum = r1+r2;
            System.out.println(r1+" and "+r2+" = "+randomSum);

        }

    }
}
