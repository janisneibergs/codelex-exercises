package io.codelex.arithmetic.exercises;
import java.util.Random;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {


    Random rand = new Random();

        int max = 99;
        int randomNumber = rand.nextInt(max);
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        System.out.print("> ");

        String enteredNumber = input.nextLine();
        int number = Integer.parseInt(enteredNumber);

        if(randomNumber == number){
            System.out.println("You guessed it!  What are the odds?!?");
        }
        if(randomNumber > number){
            System.out.println("Sorry, you are too low.  I was thinking of "+randomNumber+".");
        }
        if(randomNumber < number){
            System.out.println("Sorry, you are too high.  I was thinking of "+randomNumber+".");
        }

    }
}
