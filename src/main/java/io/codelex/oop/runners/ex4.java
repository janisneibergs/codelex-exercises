package io.codelex.oop.runners;

public class ex4 {
    public static void main(String[] args) {
        int minTime = 30;
        int maxTime = 60;
        int timeRunned = 45;

        if (timeRunned < minTime) {
            System.out.println(Runner.HIGH);
        } else if (timeRunned >= minTime && timeRunned <= maxTime) {
            System.out.println(Runner.MEDIUM);
        } else {
            System.out.println(Runner.LOW);
        }
    }
}
