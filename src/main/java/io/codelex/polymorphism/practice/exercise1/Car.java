package io.codelex.polymorphism.practice.exercise1;

public interface Car {

    public default void speedUp() {
    }

    public default void slowDown() {
    }

    public default String showCurrentSpeed() {
        return null;
    }

    public default void startEngine() {
    }
}
