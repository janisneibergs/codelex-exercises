package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {


    public Tiger(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    public void tigerSound() {
        System.out.println("Rrrr...");
    }

    @Override
    void eat(String food) {
        if (food.equals("Meat")) super.eat();
    }
}
