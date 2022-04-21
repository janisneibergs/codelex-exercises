package io.codelex.polymorphism.practice.exercise2;

public class MakeSounds {
    public static void main(String[] arg) {
        Radio radio = new Radio();
        Firework firework = new Firework();
        Parrot parrot = new Parrot();

        radio.playSound();
        firework.playSound();
        parrot.playSound();
    }
}
