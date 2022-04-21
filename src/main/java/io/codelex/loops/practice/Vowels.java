package io.codelex.loops.practice;

import java.util.Scanner;

public class Vowels {

    //TODO: print all vowels using for and foreach
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Write text");

        String text = input.nextLine();

        //todo - use for
        for(int s = 0; s<text.length(); s++) {
            for (int i = 0; i < vowels.length; i++) {
                if (vowels[i] == (text.charAt(s))) System.out.print(text.charAt(s));
            }
        }


        //todo - use foreach
        for (char vowel : vowels){
            for(char letter : text.toLowerCase().toCharArray()) {
                if (letter == vowel) System.out.println(vowel);


            }
        }

    }

}
