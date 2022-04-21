package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    private String livingRegion;


    public Mammal(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }


    @Override
    void eat() {
        super.eat();
    }

    abstract void eat(String food);
}
