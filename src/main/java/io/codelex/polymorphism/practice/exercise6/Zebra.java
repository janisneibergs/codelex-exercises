package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {


    public Zebra(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void eat(String food) {
        if (food.equals("Vegtables")) super.eat();
    }
}
