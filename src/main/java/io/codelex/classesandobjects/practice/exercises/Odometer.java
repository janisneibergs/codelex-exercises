package io.codelex.classesandobjects.practice.exercises;

public class Odometer {
    private static double miles;
    private static double addMiles;

    public static int getAddMiles() {
        return (int) addMiles;
    }

    public void setAddMiles(int addMiles) {
        this.addMiles = addMiles;
    }

    public static double getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public static double currentMiles() {
        return getMiles();
    }

    public double drive() {
        if (getMiles() + getAddMiles() < 999.999) {
            return getMiles() + getAddMiles();
        } else {
            return (1000 + getMiles() - getAddMiles());
        }
    }
}
