package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
   static int NUMBERED_SURVEYED = 12467;
    static double PURCHASED_ENERGY_DRINKS = 0.14;
    static double PREFER_CITRUS_DRINKS = 0.64;




    public static void main(String[] args) {

        //fixme
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + calculateEnergyDrinkers() + " bought at least one energy drink");
        System.out.println(preferCitrus() + " of those " + "prefer citrus flavored energy drinks.");
    }


    public static double calculateEnergyDrinkers(){
       return NUMBERED_SURVEYED * PURCHASED_ENERGY_DRINKS;
    }

    public static double preferCitrus() {
        return calculateEnergyDrinkers() * PREFER_CITRUS_DRINKS;
    }
}
