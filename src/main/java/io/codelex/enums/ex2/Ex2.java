package io.codelex.enums.ex2;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Sps sps = Sps.SCISSORS;
        Scanner input = new Scanner(System.in);
        boolean quit = true;
        System.out.println("Let us begin...");


        while (quit) {
            System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            Scanner in = new Scanner(System.in);
            String player = in.next();
            String playerMove = player.toLowerCase();
            String computerMove = getComputerMove();
            if (playerMove.equals("q")) quit = false;
            else if (playerMove.equals(computerMove))
                System.out.println("Tie!");

            else if (playerMove.equals(sps.STONE.key)) {
                if (computerMove.equals(sps.PAPER.key)) System.out.println("Paper wraps stone, I won");
                else System.out.println("You won!");

            } else if (playerMove.equals(sps.PAPER.key)) {
                if (computerMove.equals(sps.SCISSORS.key)) System.out.println("Scissors cuts paper, I won!");
                else System.out.println("You won!");
            } else {
                if (computerMove.equals(sps.STONE.key)) System.out.println("Stone breaks scissors");
                else System.out.println("You won!");
            }
        }


    }

    public static String getComputerMove() {
        Sps sps = Sps.SCISSORS;
        String computermove;
        Random random = new Random();


        int input = random.nextInt(3) + 1;
        if (input == 1) {
            computermove = sps.STONE.key;
            System.out.println("My turn: " + sps.STONE);
        } else if (input == 2) {
            computermove = sps.PAPER.key;
            System.out.println("My turn: " + sps.PAPER);
        } else {
            computermove = sps.SCISSORS.key;
            System.out.println("My turn: " + sps.SCISSORS);
        }

        System.out.println();
        return computermove;
    }


}
