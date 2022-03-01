package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int sum = 0;
        String rollAgain = "y";
        int rounds = 1;
        while(rounds<4 ) {
            rounds += 1;
            int dice = rand.nextInt(5) + 1;

            if (dice > 1) {
                sum += dice;
                System.out.println("You rolled a " + dice + "!");
                System.out.print("Roll again ");
                String key = input.nextLine();
                rollAgain = key;
                if(rollAgain.equals("n")) break;


            } else {
                System.out.println("You rolled a 1!");
                sum = 0;

            }

        }
        System.out.println("You got "+ sum +" points.");
    }
}