package io.codelex.polymorphism.practice.exercise6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter animal type: ");
        String animalType = input.nextLine();

        System.out.print("Enter animal name: ");
        String animalName = input.nextLine();


        System.out.print("Enter animal wight: ");
        int animalWeight = input.nextInt();
        System.out.print("Enter animal living place: ");
        String livingRegion = input.nextLine();

        switch (animalType) {
            case "Cat":
                System.out.print("Enter cats bread: ");
                String catBreed = input.nextLine();

                System.out.println("What food he eats? ");
                String food = input.nextLine();

                System.out.println("How much?");
                int whatFood = input.nextInt();

                Cat cat = new Cat(animalType, animalName, animalWeight, whatFood, livingRegion, catBreed);
                cat.makeSound();
                cat.eat(food);
                
        }


    }


}
