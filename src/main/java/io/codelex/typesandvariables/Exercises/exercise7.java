package io.codelex.typesandvariables.Exercises;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ierakstiet tekstu");
        String input = myObj.nextLine();
        int upperCase=0;
        for(int i=0; i < input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))) {
                upperCase++;
            }
        }
        System.out.println(upperCase);
    }

}
