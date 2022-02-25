package io.codelex.typesandvariables.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String Name;
        String Eyes;
        String Teeth;
        String Hair;
        int Age;
        int Height;

        int Weight;
        double HeightInCm;
        double WeightInKg;

        Name = "Zed A. Shaw";
        Age = 35;
        Height = 74;  // inches
        BigDecimal bd = new BigDecimal(Height * 2.74).setScale(2, RoundingMode.HALF_UP);
        HeightInCm = bd.doubleValue();

        Weight = 180; // lbs
        BigDecimal bd2 = new BigDecimal(Weight * 0.453592).setScale(2, RoundingMode.HALF_UP);
        WeightInKg = bd2.doubleValue();
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + Height + " inches tall," + HeightInCm + "cm tall.");
        System.out.println("He's " + Weight + " pounds heavy." + WeightInKg + "kg heavy");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

        System.out.println("If I add " + Age + ", " + Height + ", and " + Weight
                + " I get " + (Age + Height + Weight) + ".");
    }
}