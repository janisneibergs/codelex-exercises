package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    String breed;

    public Cat(String animalName, String animalType, double animalWeight, int foodEaten, String breed, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meoov");
    }

    @Override
    void eat(String food) {
        System.out.println(food);
    }
    
}
