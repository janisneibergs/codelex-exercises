package io.codelex.polymorphism.practice.exercise1;

public interface CarWithBoost extends Car {
    public default void useNitrousOxideEngine() {
    }
}
