package io.codelex.arrays.exercises;

import java.util.Random;
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain = true;

        String[] words = {"board", "empty", "start"};
        while (playAgain) {
            String misses = "";
            int found = 0;
            int count = 0;
            String word = words[rand.nextInt(3)];
            char[] arrWord = new char[word.length()];
            char[] arrWordGuesed = new char[word.length()];

            for (int i = 0; i < word.length(); i++) {
                arrWordGuesed[i] = '-';
            }
            for (int i = 0; i < word.length(); i++) {
                arrWord[i] = word.charAt(i);
            }
            for (int i = 0; i < word.length(); i++) {
                System.out.print(arrWordGuesed[i]);
            }

            while (misses.length() + count < arrWord.length * 2 && count < word.length()) {

                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("Word:    ");
                for (int s = 0; s < arrWordGuesed.length; s++) {
                    System.out.print(arrWordGuesed[s]);
                }
                System.out.println();
                System.out.println("Misses: " + misses);
                System.out.print("Guess:   ");
                char input = in.next().charAt(0);
                for (int c = 0; c < word.length(); c++) {
                    if (arrWord[c] == input) {
                        arrWordGuesed[c] = input;
                        found++;
                        count++;

                    }
                }
                if (found > 0) {
                    found = 0;

                } else {
                    misses = misses + input;
                }
            }
            if (misses.length() + count > arrWord.length * 2 - 1 || count > word.length() - 1) {
                System.out.println("YOU GOT IT");
                System.out.println("Play \"again\" or \"quit\"");
                String answer = in.next();
                if (answer.equals("quit")) {
                    playAgain = false;

                } else if (answer.equals("again")) {
                    playAgain = true;
                }
            }
        }
    }
}


