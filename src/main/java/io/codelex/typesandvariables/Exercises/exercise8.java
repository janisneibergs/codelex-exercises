package io.codelex.typesandvariables.Exercises;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Ierakstiet ko aprēķināt minūtēs \"dienu\" vai \"gadu\"");
    String yearDayInput = myObj.nextLine();
    int minutes;
    switch (yearDayInput) {
        case ("dienu"):
            System.out.println("Ierakstiet dienu skaitu");
            String day = myObj.nextLine();
            int dayNumber = Integer.parseInt(day);
            minutes = dayNumber * 1440;
            System.out.println(day + "dienas ir: " + minutes + " minūtes");
            break;
        case ("gadu"):
            System.out.println("Ierakstiet gadu skaitu");
            String year = myObj.nextLine();
            int yearNumber = Integer.parseInt(year);
            minutes = yearNumber * 525949;
            System.out.println(year + "gadi ir: " + minutes + " minūtes");
            break;
        default:
            System.out.println("nesaprotama komanda");
    }
    }

}
